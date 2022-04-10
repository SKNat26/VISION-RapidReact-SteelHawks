package VisionGui;

import javax.swing.*;
import java.awt.*;


public class MainWindow {
    private JFrame frame;
    private int sizeX;
    private int sizeY;
    private Menu selector;
    private Background bg;

    public MainWindow(int sizeX, int sizeY, Menu selector, Background bg) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        this.selector = selector;

        this.bg = bg;
        
        frame = new JFrame();
        frame.add(bg);
        frame.pack();
        frame.setTitle("VISION GUI");
        frame.setSize(this.sizeX,this.sizeY);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(selector.getMenuBar());
        
    }

    public void show() {
        frame.setVisible(true);
    }

}
