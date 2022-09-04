
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

}
