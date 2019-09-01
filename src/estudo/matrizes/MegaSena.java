package estudo.matrizes;

import java.util.Random;

public class MegaSena {

    private int[][] arrayJogos;

    public MegaSena(){}

    public MegaSena(int qtdJogos){
        int numerosPorJogo = 6;
        arrayJogos = new int[qtdJogos][numerosPorJogo];
    }

    public void fazerJogos(){
        populaTabela(arrayJogos);        
        repetition(arrayJogos);
    }

    private void populaTabela(int[][] array) {
        // FAZ UM LOOP PELAS LINHAS
        for(int linha = 0; linha < array.length; linha++)
        {
            // FAZ LOOP PELAS COLUNAS DA LINHA ATUAL           
            System.out.println(geraJogo(array, linha));
        }
    }

    private String geraJogo(int[][] array, int linha) {
        String stringLinha = "";

        for (int coluna = 0; coluna < array[linha].length; coluna++) {
            Random aleatorio = new Random();
            int value = aleatorio.nextInt(51);

            if (contain(array[linha], value) || value == 0)
                value = aleatorio.nextInt(51);
            
            array[linha][coluna] = value;
            stringLinha = stringLinha + ((coluna == 0) ? "" : "-") + String.format("%02d", array[linha][coluna]);
        }
        return stringLinha;
    }

    private boolean contain(int[] linhaVetor, int value) {
        for(int colunaValor : linhaVetor){
            if (colunaValor == value)
                return true;
        }
        return false;
    }

    private boolean contain(int[][] arr, int value) {
        for(int linha = 0; linha < arr.length; linha++){
            for( int coluna = 0; coluna < arr[linha].length; coluna++) {
                if (arr[linha][coluna] == value) 
                    return true;
            }
        }
        return false;
    }

    private void repetition(int[][] arr) {
        int[][] valoresUnicos = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++) {
                
                for(int linha = 0; linha < arr.length; linha++) {
                    for( int coluna = 0; coluna < arr[linha].length; coluna++) {
                        if (arr[i][j] == arr[linha][coluna]) {
                            if (!contain(valoresUnicos, arr[i][j])) {
                                valoresUnicos[i][j] = arr[i][j];    
                            }
                            
                        }
                    }
                }
                
            }
        }
        confereRepeticoesImprime(valoresUnicos);
        
    }

    private void confereRepeticoesImprime(int[][] conf){
        for(int linha = 0; linha < conf.length; linha++) {
            for( int coluna = 0; coluna < conf[linha].length; coluna++) {
                
                int nVezes = 0;
                int valor = conf[linha][coluna];
                for(int i = 0; i < arrayJogos.length; i++) {
                    for( int j = 0; j < arrayJogos[i].length; j++) {
                        if (valor == arrayJogos[i][j]) {
                            nVezes++;
                        }
                    }
                }
                if (nVezes != 0 && valor != 0 && nVezes > 1)
                    System.out.println("Número: " + String.format("%02d", valor) + " Repetiçoes: " + nVezes);

            }
        }
    }
    
}

