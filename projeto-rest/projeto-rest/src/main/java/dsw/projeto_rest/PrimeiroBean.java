package dsw.projeto_rest;

public class PrimeiroBean {
	
	private String mensagem;

	public PrimeiroBean() {
	
	}

	public PrimeiroBean(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "PrimeiroBean [mensagem=" + mensagem + "]";
	}	
	
}
