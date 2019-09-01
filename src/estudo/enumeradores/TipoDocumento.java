package estudo.enumeradores;

import estudo.enumeradores.util.GeraCpfCnpj;

public enum TipoDocumento {

	CPF {      
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf(true);
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {			
			return GeraCpfCnpj.cnpj(true);
		}
	};
	
	public abstract String geraNumeroTeste();
}
