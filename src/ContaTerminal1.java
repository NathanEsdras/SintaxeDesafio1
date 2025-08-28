import java.util.Scanner;

public class ContaTerminal1 {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.print("Por favor, digite o número: ");
            int numero = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = leitor.nextLine();

            System.out.print("Por favor, digite o Nome do Cliente: ");
            String nome = leitor.nextLine();

            System.out.print("Por favor, digite o saldo: ");
            double saldo = leitor.nextDouble();

            String mensagem = "Olá " + nome
                    + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia
                    + ", conta "
                    + numero
                    + " e seu saldo "
                    + saldo
                    + " já está disponível para saque.";
            System.out.println(mensagem);


        }
}
