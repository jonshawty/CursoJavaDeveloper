import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente newCliente = new Cliente();
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o nome do novo Cliente");
			String teste = ler.next();
			newCliente.setNome(teste);
		}

		Conta cc = new ContaCorrente(newCliente);
		Conta poupanca = new ContaPoupanca(newCliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
