
public class Main {
	
	public static void main(String[] args) {
		Cliente Joelma = new Cliente();
		Joelma.setNome("Joelma");

		Conta cc = new ContaCorrente(Joelma);		
		Conta poupanša = new ContaPoupanša(Joelma);
		
		cc.depositar(100);
		cc.transferir(100, poupanša);
		
		cc.imprimirExtrato();
		poupanša.imprimirExtrato();
	}

}
