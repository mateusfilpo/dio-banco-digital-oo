package main;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Cliente mateus = new Cliente();
		mateus.setNome("Mateus");
		
		Conta cc = new ContaCorrente(mateus);
		
		Cliente souza = new Cliente();
		souza.setNome("Souza");
	
		Conta cc2 = new ContaPoupanca(souza);
		
		banco.getContas().add(cc);
		banco.getContas().add(cc2);
		
		cc.depositar(100);
		cc.transferir(cc2, 100);
		
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		
		banco.getNomeClientes();
	}

}
