import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VisionGUI{
    private JFrame frame;
    private JPanel controls;
    private JPanel data;

    public VisionGUI(int frameSizeX, int frameSizeY){
        //frame
        frame = new JFrame();
        frame.setSize(frameSizeX, frameSizeY);
        frame.add(controls, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Vision GUI");
        frame.pack();
        frame.setVisible(true);

        //controls
        controls = new JPanel();
        controls.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        controls.setLayout(new GridLayout(0, 1));
    }

    public static void main(String[] args){
        new VisionGUI(100,100);
    }

}

