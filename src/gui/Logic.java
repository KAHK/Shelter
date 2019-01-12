package gui;

import shelter.Animal;
import shelter.Shelter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.util.Arrays;

public class Logic extends MainScreenGUI {
    private Shelter shelter = new Shelter();

    private Animal curAn = null;

    private JPopupMenu contextMenu;

    public Logic(JFrame mainWindow) {
        super();
        //
        contextMenu = new JPopupMenu("Operations on animals accounts");

    }
    public static void main(String[] args) {
        JFrame shelterFrame = new JFrame("Your Shelter");
        shelterFrame.setSize(500, 400);
        shelterFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Logic exampleLogic = new Logic(shelterFrame);
        //shelterFrame.add(Logic.);
        shelterFrame.setVisible(true);
    }
}