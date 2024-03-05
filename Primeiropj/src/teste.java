
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws IOException{
        System.out.println("Olá, mundo!");
        char ch;
        ch='X';
        System.out.println("ch contains" + ch);
        ch++; //incrementa ch
        System.out.println("ch is now" + ch);
        ch = 90; // dá a ch o valor Z
        System.out.println("ch is now" + ch);

        byte tipoByte = 127;
        short tiposhort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " +tipoByte);
        System.out.println("Valor do tipoChar =  " + tipoChar);
        System.out.println("Valor do tipoFloat  " + tipoFloat);
        System.out.println("Valor do tipoDouble  " + tipoDouble);
        System.out.println("Valor do tipoInt  " + tipoInt);
        System.out.println("Valor do tipoLong  " + tipoLong);
        System.out.println("Valor do tipoBooleano  " +  tipoBooleano);

        System.out.println("Exemplo do while");
        int opcao = 1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("******** Sitema de Cadastro********");
            System.out.println("Opção 1: Cadastrar Cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0 Sair");
            System.out.println("***********************************");
            System.out.println("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("***********************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    //CadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    //cadastrarProduto();
                    break;

                case 3:
                    System.out.println("Opção 3 escolhida");
                    //CadastrarVendedor();
                    break;

                case 0:
                    System.out.println("Opção 0 escolhida.");
                    //Sair
                    break;
                default:
            }
        }while(opcao !=0);

    }
}
