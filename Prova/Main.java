import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws Exception{
        int opcao = -1;
        ArrayList<Jogador> participante = new ArrayList<>();
        
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("-------------------------");
            System.out.println("-        Bem vindo      -");
            System.out.println("-------------------------");
            System.out.println("Escolha quem você gostaria de eliminar.");
            System.out.println(" Para consultar o nome dos participantes digite 1");
            System.out.println("Para votar digite 2");
            System.out.println("Para sair digite 0");
            System.out.println("Digite a opção escolhida");
            opcao = scn.nextInt();
            switch (opcao) {
                case 1:
                listarParticipantes();
                    break;
                case 2:
                votar(participante);
                    break;
                default:
                    break;
            }

        } while (opcao != 0);
         System.out.println("Lista de participantes:");
        scn.close();
}


private static void listarParticipantes() {
    System.out.println("Para sair digite 0.");
                    System.out.println("1 -Alane Dias");
                    System.out.println("2 -Beatriz Reis");
                    System.out.println("3 -Davi Brito");
                    System.out.println("4 -Deniziane Ferreira");
                    System.out.println("5 -Fernanda Bandeira");
                    System.out.println("6 -Giovanna Lima");
                    System.out.println("7 -Giovanna Pitel");
                    System.out.println("8 -Isabelle Nogueira");
                    System.out.println("9 -Juninho");
                    System.out.println("10 -Leidy Elin");
                    System.out.println("11 -Lucas Henrique");
                    System.out.println("12 -Lucas Luigi");
                    System.out.println("13 -Lucas Pizane");
                    System.out.println("14 -Marcus Vinicius");
                    System.out.println("15 -Matteus Amaral");
                    System.out.println("16 -Maycon Cosmer");
                    System.out.println("17 -MC Bin Laden");
                    System.out.println("18 -Michel Nogueira");
                    System.out.println("19 -Nizam");
                    System.out.println("20 -Raquele Cardozo");
                    System.out.println("21 -Rodriguinho");
                    System.out.println("22 -Thalyta Alves");
                    System.out.println("23 -Vanessa Lopes");
                    System.out.println("24 -Vinicius Rodrigues");
                    System.out.println("25 -Wanessa Camargo");
                    System.out.println("26 -Yasmin Brunet");
}

private static void votar(ArrayList<Jogador> participantes) throws Exception  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número do participante: ");
    int Num = scan.nextInt();
    scan.nextLine(); 

    String nome = nomeDoParticipante(Num);
    if (nome != null) {
        // Verifica se o participante já foi votado anteriormente
        Jogador jogador = encontrarJogador(participantes, nome);
        if (jogador != null) {
            jogador.incrementarVotos();
        } else {
            participantes.add(new Jogador(nomeDoParticipante(Num)));
        }
    } else {
        System.out.println("Número de participante inválido!");
    }
}

    
private static String nomeDoParticipante(int votos) {
    switch (votos) {
        case 1:
            return "Alane Dias";
        case 2:
            return "Beatriz Reis";
        case 3:
        return "Davi Brito";
        case 4:
        return "Deniziane Ferreira";
        case 5:
        return "Fernanda Bandeira";
        case 6:
        return "Giovanna Lima";
        case 7:
        return "Giovanna Pitel";
        case 8:
        return "Isabelle Nogueira";
        case 9:
        return "Juninho";
        case 10:
        return "Leidy Elin";
        case 11:
        return "Lucas Henrique";
        case 12:
        return "Lucas Luigi";
        case 13:
        return "Lucas Pizane";
        case 14:
        return "Marcus Vinicius";
        case 15:
        return "Matteus Amaral";
        case 16:
        return "Maycon Cosmer";
        case 17:
        return "MC Bin Laden";
        case 18:
        return "Michel Nogueira";
        case 19:
        return "Nizam";
        case 20:
        return "Raquele Cardozo";
        case 21:
        return "Rodriguinho";
        case 22:
        return "Thalyta Alves";
        case 23:
        return "Vanessa Lopes";
        case 24:
        return "Vinicius Rodrigues";
        case 25:
        return "Wanessa Camargo";
        case 26:     
        return "Yasmin Brunet";
        default:
            return null;
    }
}
    private static Jogador encontrarJogador(ArrayList<Jogador> participantes, String nome) {
        for (Jogador jogador : participantes) {
            if (jogador.getNome().equals(nome)) {
                return jogador;
            }
        }
        return null;
    }


}
class Jogador  {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 1; 
        return;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVotos() {
        return this.votos;
    }

    public void incrementarVotos() {
        this.votos++;
    }
}

