package shelter;

import javax.swing.*;
import java.util.Date;
import java.util.List;
import  java.util.ArrayList;

public class Shelter {
    public List<Animal> animalsList = new ArrayList<>();
    private Integer lastAnID = 1;

    public List<Animal> getAnimalsList() {
        return animalsList;
    }

    public Animal getAnimalById(int animalID) {
        int index = findAnimalId(animalID);
        Animal animal = (index!=-1) ? animalsList.get(index) : null;
        return animal;
    }

    public Animal getNextTo(Animal animal)
    {
        Integer curIndex = animalsList.indexOf(animal);
        if (curIndex < animalsList.size() - 1) {
            return animalsList.get(curIndex + 1);
        } else {
            return animalsList.get(0);
        }
    }

    public Animal getPrevTo(Animal animal)
    {
        Integer curIndex = animalsList.indexOf(animal);
        if (curIndex > 0) {
            return animalsList.get(curIndex - 1);
        } else {
            return animalsList.get(animalsList.size() - 1);
        }
    }

    public Dog newDog(String name, String adoptionStatus, Integer age, Boolean sex, String size, String breed,
                      Boolean isSterilizated, Date admissionDate, String other) {
        Dog dog = new Dog(lastAnID++, name, adoptionStatus, age, sex, size, breed, isSterilizated, admissionDate, other);
        animalsList.add(dog);
        return dog;
    }
    public Cat newCat(String name, String adoptionStatus, Integer age, Boolean sex, String breed,
                      Boolean isSterilizated, Date admissionDate, String other) {
       Cat cat = new Cat(lastAnID++, name, adoptionStatus, age, sex, breed, isSterilizated, admissionDate, other);
        animalsList.add(cat);
        return cat;
    }
    public OtherAnimal newOtherAnimal (String name, String species, String adoptionStatus, Integer age, Boolean sex,
                                       Date admissionDate, String other) {
        OtherAnimal oa= new OtherAnimal(lastAnID++, name, species, adoptionStatus, age, sex, admissionDate, other);
        animalsList.add(oa);
        return oa;
    }



    public int findAnimalId(Integer animalID) {
        for (Animal animal : animalsList) {
            if (animal.getAnimalID().equals(animalID))
                return animalsList.indexOf(animal);
        }
        return -1;
    }

    public void removeAnimal(Integer animalToRemoveID) {
        int animalToRemoveIndex = findAnimalId(animalToRemoveID);
        animalsList.remove(animalToRemoveIndex);
    }

    public void updateAnimal(Integer animalToUpdateID, Animal newAnimal) {

        if (newAnimal==null) {
            return;
        }
        int animalToUpdateIndex = findAnimalId(animalToUpdateID);
        animalsList.set(animalToUpdateIndex, newAnimal);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "shelter.Shelter{" +
                "anList=\n" + animalsList +
                '}';
    }
}
