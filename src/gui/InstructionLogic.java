package gui;

import shelter.Instruction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionLogic {
    private  Instruction instruction;
    private JFrame instructionFrame = new JFrame("Instruction");
    private InstructionGUI instructionGUI = new InstructionGUI();
    public InstructionLogic(Instruction instruction){
        this.instruction = instruction;
        instructionFrame.add(instructionGUI.instructionPanel);
        instructionFrame.setSize(350,500);
        instructionFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        instructionGUI.contentTextArea.setText(instruction.getInstructionContent());

        instructionGUI.goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnToMenu();
            }
        });
    }

    private void returnToMenu() { instructionFrame.setVisible(false); }
    public void show() { instructionFrame.setVisible(true); }
    public void read() {instruction.toString(); }
}
