package gui;

import javax.swing.*;
import java.awt.*;

public class ShelterFrame extends MainScreenGUI{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shelter");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("My first label"));
        frame.add(myPanel);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}