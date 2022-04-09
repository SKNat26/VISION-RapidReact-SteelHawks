package VisionGui;

import javax.swing.*;

public class MainWindow {
    private JFrame frame;
    private int sizeX;
    private int sizeY;
    private menu
    
    public MainWindow(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        frame = new JFrame();
        frame.setTitle("VISION GUI");
        frame.setSize(this.sizeX,this.sizeY);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void insert(Menu m){
        
    }
}
