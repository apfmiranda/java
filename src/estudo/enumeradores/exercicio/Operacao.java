package estudo.enumeradores.exercicio;

public enum Operacao {
	
	SOMA("+") {
		@Override
		public Double executa(Double x, Double y) {			
			return x + y;
		}
	},SUBTRAI("-") {
		@Override
		public Double executa(Double x, Double y) {			
			return x - y;
		}
	},MULTIPLICA("*") {
		@Override
		public Double executa(Double x, Double y) {			
			return x * y;
		}
	},DIVIDE("/") {
		@Override
		public Double executa(Double x, Double y) {		
			return x / y;
		}
	};
	
	private String operacao;
	
	Operacao(String o) {
		operacao = o;
	}
	
	public abstract Double executa(Double x, Double y);
	
	public String toString() {
		return operacao;
	}
	
	
}
