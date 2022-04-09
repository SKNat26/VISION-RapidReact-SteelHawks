package VisionGui;

import javax.swing.*;

public class Menu {
    private JMenuBar mb;
    private JMenu menu;
    private JButton redBall;
    private JButton blueBall;
    private int sizeX;
    private int sizeY;
    
    public Menu(int sizeX,int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        redBall = new JButton("Detect Red Ball");
        blueBall = new JButton("Detect Blue Ball");

        menu = new JMenu("Select Operation");
        menu.add(redBall);
        menu.add(blueBall);
        menu.setSize(this.sizeX, this.sizeY);

        mb = new JMenuBar();
        mb.add(menu);
    }

    public void show() {
        menu.setVisible(true);
    }

    public JMenuBar getMenuBar() {
        return mb;
    }
}
