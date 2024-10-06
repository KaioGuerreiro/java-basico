import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Integer numero;
        String agencia;
        String nomeCliente;
        Float saldo;

        System.out.println("Por favor, digite o Nome !");
        nomeCliente = le.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = le.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        numero = le.nextInt();

        System.out.println("Por favor, digite o Saldo !");
        saldo = le.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma" +
                " conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível " +
                "para saque.");
    }
}
