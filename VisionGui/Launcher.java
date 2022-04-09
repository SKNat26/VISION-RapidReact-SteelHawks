package VisionGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Launcher{
    

    public Launcher(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                Menu menubar = new Menu(100,100);
                MainWindow gui = new MainWindow(500,500, menubar);
                gui.show();
            }
        });
    }

    public static void main(String[] args){
        new Launcher();
    }

}

