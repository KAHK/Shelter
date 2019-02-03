package gui;

import shelter.Instruction;
import shelter.Shelter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainScreenLogic extends MainScreenGUI {

    private Shelter shelter = new Shelter();
    private AnimalsLogic animalsLogic = new AnimalsLogic(shelter);
    private AddNewLogic addNewLogic = new AddNewLogic(shelter, animalsLogic);
    private Instruction instruction = new Instruction();
    private InstructionLogic instructionLogic = new InstructionLogic(instruction);

    public MainScreenLogic(JFrame mainWindow) {


        animalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!shelter.animalsList.isEmpty()) {
                    animalsLogic.show(shelter.animalsList.get(0));
                } else {
                    JOptionPane.showMessageDialog(mainWindow,"No animals in database. To add new animal click 'Add new'");
                }

            }
        });
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewLogic.show();
            }
        });
        instructionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { instructionLogic.show(); }
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
        shelterFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainScreenLogic mainScreenLogic = new MainScreenLogic(shelterFrame);
        shelterFrame.add(mainScreenLogic.getMainPanel());
        shelterFrame.setVisible(true);
    }
}
