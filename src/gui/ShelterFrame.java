package gui;

import javax.swing.*;
import java.awt.*;

public class ShelterFrame {

    public static void main(String[] args) {
        JFrame shelterFrame = new JFrame("shelter.Shelter App");
        shelterFrame.setSize(1000, 700);
        shelterFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        shelterFrame.setMinimumSize(new Dimension(800, 600));
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("My first label"));
        shelterFrame.add(myPanel);
        shelterFrame.setLayout(new FlowLayout());
        shelterFrame.setVisible(true);
    }
    // is it really needed?
}