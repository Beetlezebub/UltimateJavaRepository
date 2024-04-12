package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class GradientIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Draw the rectangle and fill
        g.fillRect(43, 103, 409, 255);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GradientIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.add(new GradientIllusion());
        frame.setVisible(true);
    }
}