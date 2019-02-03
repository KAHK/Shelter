package gui;

import shelter.Animal;
import shelter.Cat;
import shelter.Dog;
import shelter.OtherAnimal;
import shelter.Shelter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalsLogic{
    private Shelter shelter;
    private Animal curAnimal = null;

    private JFrame animalFrame = new JFrame("Animals");
    private JPanel parent;
    private BaseAnimalGUI baseAnimalGUI = new BaseAnimalGUI();
    private Header header = new Header();
    private CatGUI catGUI = new CatGUI();
    private DogGUI dogGUI = new DogGUI();
    private OtherAnimalGUI otherAnimalGUI = new OtherAnimalGUI();

    public AnimalsLogic(Shelter shelter) {

        this.shelter = shelter;

        parent = new JPanel();
        parent.setLayout(new BoxLayout(parent,BoxLayout.Y_AXIS));
        animalFrame.add(parent);
        animalFrame.setSize(400,600);
        animalFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        header.nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextAnimal();
            }
        });

        header.previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prevAnimal();
            }
        });

        header.saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shelter.updateAnimal(curAnimal.getID(), getCurrentAnimalData());
            }
        });

        header.goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnToMenu();
            }
        });

        header.removeAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal nextAnimal = shelter.getNextTo(curAnimal);
                shelter.removeAnimal(curAnimal.getID());
                if (nextAnimal == curAnimal) {
                    JOptionPane.showMessageDialog(animalFrame,"No more animals left in database.");
                    animalFrame.setVisible(false);
                } else {
                    goToAnimal(nextAnimal);
                }
            }
        });
    }

    private void goToAnimal(Animal animal) {

        System.out.println(animal.toString());
        curAnimal = animal;
        parent.removeAll();
        parent.add(header.headerPanel);
        parent.add(baseAnimalGUI.baseAnimalPanel);

        SimpleDateFormat admDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String admString = admDateFormat.format(animal.getAdmissionDate());

        baseAnimalGUI.animalIDLabel.setText(animal.getID().toString());
        baseAnimalGUI.nameTextField.setText(animal.getName());
        baseAnimalGUI.admDateTextField.setText(admString);
        baseAnimalGUI.adoptionComboBox.setSelectedItem(animal.getAdoptionStatus());
        baseAnimalGUI.ageTextField.setText(animal.getAge().toString());
        if (animal.getSex()) {
            baseAnimalGUI.maleRadioButton.setSelected(true);
            baseAnimalGUI.femaleRadioButton.setSelected(false);
        } else {
            baseAnimalGUI.maleRadioButton.setSelected(false);
            baseAnimalGUI.femaleRadioButton.setSelected(true);
        }
        baseAnimalGUI.otherTextField.setText(animal.getOther());

        System.out.println(animal.getClassIdentifier());

        switch(animal.getClassIdentifier()) {
            case "Cat":
                catGUI.breedTextField.setText(((Cat) animal).getBreed());
                if (((Cat) animal).getSterilizated()) {
                    catGUI.yesRadioButton.setSelected(true);
                    catGUI.noRadioButton.setSelected(false);
                } else {
                    catGUI.yesRadioButton.setSelected(false);
                    catGUI.noRadioButton.setSelected(true);
                }
                parent.add(catGUI.catPanel);
                break;
            case "Dog":
                dogGUI.breedTextField.setText(((Dog) animal).getBreed());
                if (((Dog) animal).getSterilizated()) {
                    dogGUI.yesRadioButton.setSelected(true);
                    dogGUI.noRadioButton.setSelected(false);
                } else {
                    dogGUI.yesRadioButton.setSelected(false);
                    dogGUI.noRadioButton.setSelected(true);
                }
                dogGUI.sizeComboBox.setSelectedItem(((Dog) animal).getSize());
                parent.add(dogGUI.dogPanel);
                break;
            case "OtherAnimal":
                parent.add(otherAnimalGUI.otherPanel);
                break;
        }

        parent.repaint();
        animalFrame.setVisible(true);

    }

    private void nextAnimal()
    {
        goToAnimal(shelter.getNextTo(curAnimal));
    }

    private void prevAnimal()
    {
        goToAnimal(shelter.getPrevTo(curAnimal));
    }

    private void returnToMenu() { animalFrame.setVisible(false); }

    private Animal getCurrentAnimalData()
    {
        SimpleDateFormat admDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date admDate;
        try {
            admDate = admDateFormat.parse(baseAnimalGUI.admDateTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(animalFrame, "Invalid admission date");
            return null;
        }
        int age;
        try {
            age = Integer.parseInt(baseAnimalGUI.ageTextField.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(animalFrame, "Age must be an integer");
            return null;
        }
        switch(curAnimal.getClassIdentifier()) {
            case "Cat":
                return new Cat(
                        curAnimal.getID(),
                        baseAnimalGUI.nameTextField.getText(),
                        (String) baseAnimalGUI.adoptionComboBox.getSelectedItem(),
                        Integer.parseInt(baseAnimalGUI.ageTextField.getText()),
                        baseAnimalGUI.maleRadioButton.isSelected(),
                        catGUI.breedTextField.getText(),
                        catGUI.yesRadioButton.isSelected(),
                        admDate,
                        baseAnimalGUI.otherTextField.getText()
                );
            case "Dog":
                return new Dog(
                        curAnimal.getID(),
                        baseAnimalGUI.nameTextField.getText(),
                        (String) baseAnimalGUI.adoptionComboBox.getSelectedItem(),
                        Integer.parseInt(baseAnimalGUI.ageTextField.getText()),
                        baseAnimalGUI.maleRadioButton.isSelected(),
                        (String) dogGUI.sizeComboBox.getSelectedItem(),
                        dogGUI.breedTextField.getText(),
                        dogGUI.yesRadioButton.isSelected(),
                        admDate,
                        baseAnimalGUI.otherTextField.getText()
                        );
            case "OtherAnimal":
                return new OtherAnimal(
                        curAnimal.getID(),
                        baseAnimalGUI.nameTextField.getText(),
                        otherAnimalGUI.speciesTextField.getText(),
                        (String) baseAnimalGUI.adoptionComboBox.getSelectedItem(),
                        Integer.parseInt(baseAnimalGUI.ageTextField.getText()),
                        baseAnimalGUI.maleRadioButton.isSelected(),
                        admDate,
                        baseAnimalGUI.otherTextField.getText()
                );
        }
        return null;
    }

    public void show(Animal animal) {
        goToAnimal(animal);
        animalFrame.setVisible(true);
    }
}
