package VisionGui;
import javax.swing.*;
import java.awt.*;

public class Background extends JPanel{

    private Image img;

    public Background(){
        img = new ImageIcon("VisionGui\\Images\\frcLogo.jpg").getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){
        // super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img, 0, 0, null);
    }

}