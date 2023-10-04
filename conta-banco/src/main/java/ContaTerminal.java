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
        String agencia = sc.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        //Exibir a mensagem conta criada

    }
}
