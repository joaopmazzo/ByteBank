
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100d);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200d);
		
		try {
			cc.transfere(200d, cp);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Saldo CC = "+cc.getSaldo());
		System.out.println("Saldo CP = "+cp.getSaldo());
		
	}
	
}
