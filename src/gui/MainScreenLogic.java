package gui;

import gui.AnimalsLogic;
import shelter.Cat;
import shelter.Dog;
import shelter.Instruction;
import shelter.Shelter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class MainScreenLogic extends MainScreenGUI {

    private Shelter shelter = new Shelter();

    public MainScreenLogic(JFrame mainWindow) {
        Cat c1 = shelter.newCat("Billy", "processing",9,"male","crossbreed",
                true,"today",null);
        Dog d1 = shelter.newDog("Jack","waiting", 5, "male", "small",
                "German Shepsherd", true, null,null);
        animalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!shelter.animalsList.isEmpty()) {
                    AnimalsLogic animalsLogic = new AnimalsLogic(shelter);
                } else {
                    JOptionPane.showMessageDialog(mainWindow,"No animals in database");
                }

            }
        });
        adoptedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (!shelter.animalsList.isEmpty()) {
             //if adoptionStatua = adopted
                    AnimalsLogic animalsLogic = new AnimalsLogic(shelter);
                    //else {
                    //JOptionPane.showMessageDialog(mainWindow,"No animals in database");
                //}
                } else {
                    JOptionPane.showMessageDialog(mainWindow,"No animals in database");
                }

            }
        });
        instructionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Instruction instruction = new Instruction();
                InstructionLogic instructionLogic = new InstructionLogic(instruction);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame shelterFrame = new JFrame("Main menu");
        shelterFrame.setSize(350, 500);
        shelterFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        MainScreenLogic mainScreenLogic = new MainScreenLogic(shelterFrame);
        shelterFrame.add(mainScreenLogic.getMainPanel());
        shelterFrame.setVisible(true);
    }
}
