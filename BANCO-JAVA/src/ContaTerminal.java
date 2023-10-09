import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        BancoDio();
    }

    public static void BancoDio()
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("bem vindo ao banco DIO");

        System.out.println("Por favor insira o numero da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor insira a sua agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor insira o seu Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor insira o seu Saldo:");       
        float Saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+Saldo+" já está disponível para saque");

    }
}
