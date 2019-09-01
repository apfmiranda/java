package estudo.enumeradores;


public class Teste {

    public static void main(String[] args) {
        usandoConstantes();
        
        System.out.println();
        
        for (DiaSemana dia: DiaSemana.values()) {
        	System.out.println(dia + " - " + dia.getValor());
        }
        
        System.out.println();
        
        usandoEnum();
    }

    private static void usandoConstantes(){
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca   = DiaSemanaConstantes.TERCA;
        int quarta  = DiaSemanaConstantes.QUARTA;
        int quinta  = DiaSemanaConstantes.QUINTA;
        int sexta   = DiaSemanaConstantes.SEXTA;
        int sabado  = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
    private static void usandoEnum(){
    	System.out.println("Teste utilizando Enumeradores no Java");
        imprimeDiaSemana(DiaSemana.SEGUNDA.getValor());
        imprimeDiaSemana(DiaSemana.TERCA.getValor());
        imprimeDiaSemana(DiaSemana.QUARTA.getValor());
        imprimeDiaSemana(DiaSemana.QUINTA.getValor());
        imprimeDiaSemana(DiaSemana.SEXTA.getValor());
        imprimeDiaSemana(DiaSemana.SABADO.getValor());
        imprimeDiaSemana(DiaSemana.DOMINGO.getValor());
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("sugunda-feira");
                break;
            case 2:
                System.out.println("terça-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            
        }
    }
}