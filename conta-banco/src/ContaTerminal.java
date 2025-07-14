import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO SANTANDER\n");
        int numero;
        String agencia, nomeCliente;
        double saldo;
        System.out.print("Digite o número da agência: ");
        agencia = sc.nextLine();
        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Saldo: R$");
        saldo = sc.nextDouble();
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta número ").concat(String.valueOf(numero)).concat(" e seu saldo de R$")
                .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagem);

        sc.close();
    }
}
