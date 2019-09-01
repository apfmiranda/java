package estudo.enumeradores.exercicio;

import java.util.Random;

public class App {
	
	public static void main(String args[]) {
		
		Random rd = new Random();
		
		double x = Math.round(rd.nextDouble() * 100);
		double y = Math.round(rd.nextDouble() * 100);

		for (Operacao operacao: Operacao.values()) {
//			System.out.println("Operação: " + operacao);			
			System.out.println(	
					x + " " + operacao.toString() + " " + y 
					+ " = " + operacao.executa(x, y));
			System.out.println("");
		}
		
	}

}
