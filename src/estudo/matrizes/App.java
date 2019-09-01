package estudo.matrizes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número de jogos que voce quer gerar: ");

        int valor = scan.nextInt();
        int qtdJogos = (valor > 0) ? valor : 1;

        MegaSena mega = new MegaSena(qtdJogos);
        mega.fazerJogos();
        scan.close();
    }
}

