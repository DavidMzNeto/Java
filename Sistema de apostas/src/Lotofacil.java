import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lotofacil extends JFrame {

    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar em par ou impar");


    public Lotofacil() {
        this.setTitle("** Lotofácil **");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(100, 100, 100));
        painel.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });
        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });
        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });

        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);

        this.add(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void aposta1() {
        Random rand = new Random();

        Object num = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ", "Aposta 1", JOptionPane.INFORMATION_MESSAGE, null, null, "");
        int numeroSorteado = rand.nextInt(100);
        if (num.equals(numeroSorteado)) {
            JOptionPane.showMessageDialog(null, "Parabéns! Milzão no pix.", "Aposta 1", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! Você perdeu. O número sorteado foi: " + numeroSorteado + ".");
        }
    }

    private void aposta2() {
        Random aleatorio = new Random();
    char letra = letra(aleatorio);
    Object palpiteObj = JOptionPane.showInputDialog(null, "Digite a letra (Minúscula): ", "Aposta 2", JOptionPane.INFORMATION_MESSAGE, null, null, "");
    if (palpiteObj != null) { 
        String palpiteStr = (String) palpiteObj;
        if (palpiteStr.length() == 1) { 
            char palpite = palpiteStr.charAt(0);
            if (palpite == letra) {
                JOptionPane.showMessageDialog(null, "Parabéns! Quinhentão no pix.", "Aposta 2", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letra + ".");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas uma letra.", "Aposta 2", JOptionPane.WARNING_MESSAGE);
        }
    }

    }

    private char letra(Random aleatorio) {
        int  Cletra = aleatorio.nextInt(26);
        Cletra += (int) 'a';
        return (char) Cletra;
    }

    private void aposta3() {
        Object betObj = JOptionPane.showInputDialog(null, "Digite um número: ", "Aposta 3", JOptionPane.INFORMATION_MESSAGE);
        if (betObj != null) { // Verifica se o usuário cancelou a entrada
            int bet = Integer.parseInt(betObj.toString());
            if (bet % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Parabéns! Cemzão no pix.", "Aposta 3", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Que pena! A premiação era para números pares.", "Aposta 3", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SplashScreen splash = new SplashScreen();
        splash.show(); 
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        splash.hide(); 
        new Lotofacil();
    }
}
