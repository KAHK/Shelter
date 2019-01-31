package gui;

import shelter.Animal;
import shelter.Instruction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InstructionLogic extends InstructionGUI {

    public InstructionLogic(Instruction instruction) {


        JFrame instructionFrame = new JFrame("Instruction");

        JPanel parent = new JPanel();
        parent.setLayout(new BoxLayout(parent, BoxLayout.Y_AXIS));
        instructionFrame.add(parent);
        instructionFrame.setSize(400, 600);
        instructionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        InstructionGUI instructionGUI = new InstructionGUI();

        JPanel instructionPanel = instructionGUI.instructionPanel;


        parent.add(instructionPanel);
//XD
    }
}
