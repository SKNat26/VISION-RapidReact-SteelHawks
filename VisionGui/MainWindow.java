package VisionGui;

import javax.swing.*;

public class MainWindow {
    private JFrame frame;
    private int sizeX;
    private int sizeY;
    private Menu selector;
    
    public MainWindow(int sizeX, int sizeY, Menu selector) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        this.selector = selector;
        
        frame = new JFrame();
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
