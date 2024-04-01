import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int opcao = 0 ;
        int saldo = 100;
        int valAposta = 0;
        do{
            Random rand =  new Random();
            Random aleatorio = new Random();
            int numSorteado = rand.nextInt(101);
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL");
            System.out.println("Escolha o jogo para apostar:");
            System.out.println("Opção 1: Adivinhe o número aleatório!");
            System.out.println("Opção 2: Adivinhe a letra");
            System.out.println("Opção 3: Par ou ímpar");
            System.out.println("Sair: 0");
            System.out.println("**************************");
            System.out.println("Quanto deseja apostar?");
            valAposta= scn.nextInt();
            System.out.println("Qual jogo deseja jogar? : ");
            System.out.println("Seu saldo é: "+ saldo + ".");
            opcao = scn.nextInt();
                switch (opcao) {
                    case 1:
                    System.out.println("Bem vindo ao Jogo : Adivinhe o número aleatório! ");
                    System.out.println("Digite sua aposta: ");
                    int chute = -1;
                    chute = scn.nextInt();

                        if(chute == numSorteado){
                            System.out.println("**************************");
                            System.out.println("Parabéns Você ganhou R$ 1.000,00 reais!");
                            System.out.println("**************************");
                            saldo += 1000;
                        }else if (chute < 0 || chute > 100) {
                            System.out.println("**************************");
                            System.out.println("Número inválido");
                            System.out.println("**************************");
                        }
                        else {
                            System.out.println("**************************");
                            System.out.println("Que pena, você errou. O número sorteado foi: " +numSorteado);
                            saldo -= valAposta;
                            System.out.println("**************************");
                        }
                        break;
                    case 2:
                    System.out.println("**************************");
                    System.out.println("Bem vindo ao jogo: Adivinhe a letra");
                    System.out.println("**************************");
                    char letra = letra(aleatorio);
                    char palpite = scn.next().charAt(0);                    
                        if(palpite == letra){
                        System.out.println("**************************");
                        System.out.println("Você ganhou R$ 500,00 reais.");
                        System.out.println("**************************");
                        saldo += 500;
                        } else {
                            System.out.println("**************************");
                            System.out.println("Que pena! A letra sorteada foi: "+ letra + ".");
                            System.out.println("**************************");
                            saldo -= valAposta;
                        }
                            letra = letra(aleatorio);
                        break;
                    case 3:
                    System.out.println("**************************");
                    System.out.println("Bem vindo ao Jogo : Par ou ímpar! ");
                    System.out.println("**************************");

                    System.out.println("Digite sua aposta (par ou impar): ");
                    int aposta = scn.nextInt();
                    if (aposta %2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais. ");
                        saldo += 100;
                    } else{
                        System.out.println("**************************");
                        System.out.println("Que pena! A premiação era para números pares.");
                        System.out.println("**************************");
                        saldo -= valAposta;
                    }
                        break;
                    default:
                        break;
                }
        }while(opcao != 0);
        scn.close();
    }

    private static char letra(Random aleatorio) {
        int Cletra = aleatorio.nextInt(26);
        Cletra += (int) 'a';
        return (char) Cletra;
    }
}
