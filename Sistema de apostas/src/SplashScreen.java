import javax.swing.*;
import java.awt.*;
    public class SplashScreen {

        private JDialog dialog;
    
        public SplashScreen() {
            dialog = new JDialog();
            dialog.setUndecorated(true); 
            dialog.getContentPane().setBackground(Color.WHITE); 
            JLabel label = new JLabel(new ImageIcon("lib/Lotofacil.png"));
            dialog.add(label);
            dialog.pack(); 
    
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - dialog.getWidth()) / 2;
            int y = (screenSize.height - dialog.getHeight()) / 2;
            dialog.setLocation(x, y);
        }
    
        public void show() {
            dialog.setVisible(true);
        }
    
        public void hide() {
            dialog.setVisible(false);
        }
    
}
