package br.com.bytebank.banco.modelo;

public class GuardadorGenerico {

	private Object[] referencias;
	private int posicaoLivre;

	public GuardadorGenerico() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
