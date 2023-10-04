import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o número da agência:");
        int numero = sc.nextInt();
        System.out.println("Digite a agência: ");
        String agencia = sc.next();
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " +  numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
