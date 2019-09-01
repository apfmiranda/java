package estudo.enumeradores;

public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int dia){
		this.valor = dia;
	}
	
	public int getValor(){
		return valor;
	}
	

}
