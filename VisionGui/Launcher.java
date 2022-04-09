package VisionGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Launcher{
    

    public Launcher(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                Menu control = new Menu(500,500);
                control.show();
            }
        });
    }

    public static void main(String[] args){
        new Launcher();
    }

}

