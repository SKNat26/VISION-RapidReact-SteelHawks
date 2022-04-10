package VisionGui;
import javax.swing.*;
import java.awt.*;

public class Launcher{
    

    public Launcher(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                Menu menubar = new Menu(100,100);
                Background background = new Background();
                MainWindow gui = new MainWindow(500,500, menubar, background);
                gui.show();
            }
        });
    }

    public static void main(String[] args){
        new Launcher();
    }

}

