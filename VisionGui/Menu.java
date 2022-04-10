package VisionGui;

import javax.swing.*;

public class Menu {
    private JMenuBar mb;
    private JMenu menu;
    private JMenuItem redBall;
    private JMenuItem blueBall;
    private int sizeX;
    private int sizeY;
    
    public Menu(int sizeX,int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        redBall = new JMenuItem("Detect Red Ball");
        blueBall = new JMenuItem("Detect Blue Ball");

        mb = new JMenuBar();
        menu = new JMenu("Select Operation");
        mb.add(menu);
        menu.add(redBall);
        menu.add(blueBall);
        menu.setSize(this.sizeX, this.sizeY);

    }

    public void show() {
        menu.setVisible(true);
    }

    public JMenuBar getMenuBar() {
        return mb;
    }
}
