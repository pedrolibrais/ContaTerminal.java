import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        String nomeDoUsuario;
        String Agencia;
        int numeroDaConta;
        double Saldo;

        System.out.println("Por favor, digite o nome do usuário: ");
        nomeDoUsuario = Input.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        Agencia = Input.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numeroDaConta = Input.nextInt();
        
        System.out.println("Por favor, digite o saldo para saque: ");
        Saldo = Input.nextDouble();

        System.out.println(ImprimaAResposta(nomeDoUsuario, Agencia, numeroDaConta, Saldo));

    }
    public static String ImprimaAResposta(String nomeDoUsuario, String Agencia, int numeroDaConta, double Saldo){ 
        String Message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeDoUsuario, Agencia, numeroDaConta, Saldo);
        return Message;
    }
}
