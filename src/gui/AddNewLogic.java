package gui;

import shelter.Animal;
import shelter.Shelter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AddNewLogic
{
    private Shelter shelter;
    private JFrame addNewFrame = new JFrame("Add new");
    private AddNewGUI addNewGUI = new AddNewGUI();
    private AnimalsLogic animalsLogic;

    public AddNewLogic(Shelter shelter, AnimalsLogic animalsLogic)
    {
        this.animalsLogic = animalsLogic;
        this.shelter = shelter;
        addNewFrame.add(addNewGUI.addNewPanel);
        addNewFrame.setSize(350, 150);
        addNewFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        addNewGUI.addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animal = null;
                switch((String) addNewGUI.speciesComboBox.getSelectedItem()) {
                    case "Cat":
                        animal = shelter.newCat(
                                "",
                                "waiting",
                                0,
                                false,
                                "",
                                false,
                                new Date(),
                                ""
                        );
                        break;
                    case "Dog":
                        animal = shelter.newDog(
                                "",
                                "waiting",
                                0,
                                false,
                                "",
                                "",
                                false,
                                new Date(),
                                ""
                        );
                        break;
                    case "Other":
                        animal = shelter.newOtherAnimal(
                                "",
                                "",
                                "waiting",
                                0,
                                false,
                                new Date(),
                                ""
                        );
                        break;
                }
                addNewFrame.setVisible(false);
                animalsLogic.show(animal);
            }
        });

        addNewGUI.cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewFrame.setVisible(false);
            }
        });
    }

    public void show()
    {
        addNewFrame.setVisible(true);
    }

}