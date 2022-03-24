
public class Main {
	
	public static void main(String[] args) {
		Cliente Joelma = new Cliente();
		Joelma.setNome("Joelma");

		Conta cc = new ContaCorrente(Joelma);		
		Conta poupan�a = new ContaPoupan�a(Joelma);
		
		cc.depositar(100);
		cc.transferir(100, poupan�a);
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();
	}

}
