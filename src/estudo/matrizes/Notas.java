package estudo.matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Notas {
	
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int qtdAlunos = lerQuantidadeAlunos(scan);        
        boolean simulaNotas = lerSimulaNotas(scan);

        Double[][] notasAlunos = new Double[qtdAlunos][4];

        if (simulaNotas) {
        	Matrizes m = new Matrizes();
            notasAlunos = m.geraValoresRandomDouble(notasAlunos);	
        } else {
        	notasAlunos = lerNotas(notasAlunos, scan);
        }
        

        imprimeNotas(notasAlunos);
        scan.close();
    }

	private static void imprimeNotas(Double[][] notasAlunos) {
		DecimalFormat df2 = new DecimalFormat();
        df2.setMinimumFractionDigits(2);
        df2.setMaximumFractionDigits(2);
        
		int indexAluno = 1;
        for (Double[] notasAluno : notasAlunos) {
            System.out.print("Notas do aluno " + String.format("%02d", indexAluno) +": [");

            int indexNota = 0;
            Double somaNotas = 0.0 ;
            for (Double nota : notasAluno) {                
                somaNotas = Double.sum(somaNotas, nota); 
                System.out.print((indexNota == 0) ? "" : " - ");
                System.out.print(df2.format(nota));
                indexNota++;
            }
            System.out.print("] Média = " + df2.format(somaNotas / notasAluno.length));

            indexAluno++;
            System.out.println();
        }
	}
	
	private static Double[][] lerNotas(Double[][] notasAlunos, Scanner scan) {
		Double[][] cloneNotasAlunos = notasAlunos.clone();
		
		int index = 0;
		for (Double[] notasAluno : notasAlunos) {
			System.out.println("Notas do aluno: " + (index + 1));
			
			int index2 = 0;
			for (Double nota : notasAluno) {
				System.out.println("Digite a nota " + (index2 + 1) + "/" + notasAluno.length);
				nota = scan.nextDouble();
				
				cloneNotasAlunos[index][index2] = nota;
				
				index2++;
			}
			
			index++;
		}
		
		return cloneNotasAlunos;
	}

	private static boolean lerSimulaNotas(Scanner scan) {
		System.out.print("Simula notas? <S> ou <N>: ");
		boolean isSimulate = false;
		
		if (scan.nextLine().toUpperCase().equals("N")) {
			isSimulate = false;
		} else 
			if (scan.nextLine().toUpperCase().equals("S")) {
				isSimulate = true;
		}
		
		return isSimulate;
	}

	private static int lerQuantidadeAlunos(Scanner scan) {
		System.out.print("Digite o número de Alunos: ");
        int qtdAlunos = scan.nextInt();
        qtdAlunos = (qtdAlunos == 0) ? 1 : qtdAlunos;
		return qtdAlunos;
	}
    
}

class Matrizes {

    public Matrizes() {}

    public Double[][] geraValoresRandomDouble(Double[][] matriz) {
        matriz =  new Double[matriz.length][matriz[0].length];
        
        for(int linha = 0; linha < matriz.length; linha++){
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = round2Decimals(ThreadLocalRandom.current().nextDouble(4, 10));
            }
        }
        return matriz;
    }

    private double round2Decimals(double numero) {
		double result = numero * 100;
		result = Math.round(result);
		result = result / 100;
		return result;
	}

}