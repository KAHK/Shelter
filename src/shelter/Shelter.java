package shelter;

import java.util.List;
import  java.util.ArrayList;

public class Shelter {
    public List<Animal> animalsList = new ArrayList<>();
    private Integer lastAnID = 1;

    public Dog newDog(String name, String adoptionStatus, Integer age, String sex, String size, String breed,
                      Boolean isSterilizated, String admissionDate, String other) {
        Dog dog = new Dog(lastAnID++, name, adoptionStatus, age, sex, size, breed, isSterilizated, admissionDate, other);
        animalsList.add(dog);
        return dog;
    }
    public Cat newCat(String name, String adoptionStatus, Integer age, String sex, String breed,
                      Boolean isSterilizated, String admissionDate, String other) {
       Cat cat = new Cat(lastAnID++, name, adoptionStatus, age, sex, breed, isSterilizated, admissionDate, other);
        animalsList.add(cat);
        return cat;
    }
    public OtherAnimal newOtherAnimal (String name, String species, String adoptionStatus, Integer age, String sex,
                                       String admissionDate, String other) {
        OtherAnimal oa= new OtherAnimal(lastAnID++, name, species, adoptionStatus, age, sex, admissionDate, other);
        animalsList.add(oa);
        return oa;
    }



    private int findAnimalId(Integer animalID) {
        for (Animal animal : animalsList) {
            if (animal.getAnimalID().equals(animalID))
                return animalsList.indexOf(animal);
        }
        return -1;
    }
    public void removeAnimal(Integer animalToRemoveID) {
        int animalToRemoveId = findAnimalId(animalToRemoveID);
        animalsList.remove(animalToRemoveId);
    }
    @Override
    public String toString() {
        return "shelter.Shelter{" +
                "anList=\n" + animalsList +
                '}';
    }
}
