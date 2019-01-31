package shelter;

import gui.DogGUI;

import javax.swing.*;

public class Dog extends Animal {
    private String size;
    private Boolean isSterilizated;
    private String breed;
    public Dog(Integer ID, String name, String adoptionStatus, Integer age, String sex, String size, String breed,
               Boolean isSterilizated, String admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getSterilizated() {
        return isSterilizated;
    }

    public void setSterilizated(Boolean sterilizated) {
        isSterilizated = sterilizated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public JPanel getCustomPanel() {
        return new DogGUI().dogPanel;
    }

}
