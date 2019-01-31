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

public class DogLogic extends DogGUI {
/*    private Shelter shelter = new Shelter();

    private Animal curAn = null;

    private JPopupMenu contextMenu;

    public DogLogic(JFrame mainWindow) {
        super();
        //
        contextMenu = new JPopupMenu("Operations on animals accounts");
        addNewDogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                admDateTextField.setText("");
                //animalIDLabel.setText(an.getID().toString());
            }
        });

    }
            public void displayAnimal(Animal an) {

            curAn = an;

            nameTextField.setText(an.getName());
            //ageTextField.setInteger(an.getAge());
            admDateTextField.setText(an.getAdmissionDate());
            animalIDLabel.setText(an.getID().toString());

            }
/*public static void main(String[] args) {
        JFrame shelterFrame = new JFrame("Your Shelter");
        shelterFrame.setSize(500, 400);
        shelterFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        DogLogic exampledLogic = new DogLogic(shelterFrame);
        //shelterFrame.add(DogLogic.);
        shelterFrame.setVisible(true);*/
}