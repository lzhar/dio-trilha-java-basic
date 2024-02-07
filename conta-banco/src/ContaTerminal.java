import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Scan do numero
        Scanner scanNumero = new Scanner(System.in);
        System.out.println("DIGITE SEU NUMERO");
        int numero = scanNumero.nextInt();
        
        //Scan da agencia
        Scanner scanAgencia = new Scanner(System.in);
        System.out.println("DIgite sua agencia");
        String agencia = scanAgencia.nextLine();

        //Scan nome do cliente 

        Scanner scanNomeCliente = new Scanner(System.in);
        System.out.println("DIgite seu nome");
        String nome = scanNomeCliente.nextLine();

        //Scan saldo

        Scanner scanSaldoConta = new Scanner(System.in);
        System.out.println("Digite seu saldo");
        Double saldo = scanSaldoConta.nextDouble();


        System.out.println("O cliente do numero: " + numero + " cliente da agencia " + agencia + " é chamado " + nome + " e possui " + saldo + " de saldo" );

        


        

        //TODO:Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem final
    }
}
