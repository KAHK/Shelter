package gui;

import shelter.Animal;
import shelter.Shelter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalsLogic{
    private Animal curAnimal = null;
    /*private JPanel baseAnimalPanel;
    private JPanel footerPanel;
    private JPanel customPanel;*/

    public AnimalsLogic(Shelter shelter) {
        int Id = shelter.animalsList.get(0).getID();
        curAnimal = shelter.getAnimalById(Id);
        JFrame animalFrame = new JFrame("Animals");
        JPanel parent = new JPanel();
        parent.setLayout(new BoxLayout(parent,BoxLayout.Y_AXIS));
        animalFrame.add(parent);
        animalFrame.setSize(400,600);
        animalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BaseAnimalGUI baseAnimalGUI = new BaseAnimalGUI();
        FooterGUI footerGUI = new FooterGUI();

        JPanel baseAnimalPanel = baseAnimalGUI.baseAnimalPanel;
        JPanel footerPanel = footerGUI.footerPanel;

        parent.add(baseAnimalPanel);
        parent.add(curAnimal.getCustomPanel());
        parent.add(footerPanel);

        footerGUI.nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        animalFrame.setVisible(true);
        if (curAnimal == null) {
            JOptionPane.showMessageDialog(animalFrame,"No animals in database");
            return;
        } else {
            goToAnimal(parent, curAnimal);
        }

    }

    private void goToAnimal(JPanel parent, Animal animal) {
        JPanel customPanel = curAnimal.getCustomPanel();
        parent.repaint();
    }
}
