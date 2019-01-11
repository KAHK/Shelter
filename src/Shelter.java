import java.util.Date;
import java.util.List;
import  java.util.ArrayList;

public class Shelter {
    private List<Animal> animalsList = new ArrayList<>();
    private Integer lastAnID = 1;

    /*public Animal newAnimal(String name, String adoptionStatus, Integer age, Boolean sex,
                            Date String admissionDate, String other) {
        Animal an = new Animal(lastAnID++, name, adoptionStatus, age, sex, admissionDate, other);
        animalsList.add(an);
        return an;
    }*/

    public Animal newAnimal(String animalType) {
        Animal an;
        switch (animalType) {
            case "Cat":
                an = new Cat(lastAnID++, "name", "waiting", 0, true,
                        "breed", true, null, null);
                break;
            case "Dog":
                an = new Dog(lastAnID++, "name", "waiting", 0, true,
                        "size", "breed", true, null, null);
                break;
            case "Other":
                an = new OtherAnimal(lastAnID++, "name", "species", "waiting",
                        0, true, null, null);
                break;
        }
        return null;
    }
    /*public Dog newDog(Integer ID, String name, String adoptionStatus, Integer age, String sex, String size, String breed,
                      Boolean isSterilizated, Date admissionDate, String other) {
        Dog dog = new Dog(ID, name, adoptionStatus, age, sex, size, breed, isSterilizated, admissionDate, other);
        animalsList.add(dog);
        return dog;
        ??!!
    }*/


    /*private int findAnimalId(Integer animalID) {
        for (Animal animal : animalsList) {
            if (animal.getAnimalID().equals(animalID))
                return animalsList.indexOf(animal);
        }
        return -1;
    }
    public void removeAnimal(Integer animalToRemoveID) {
        int animalToRemoveId = findAnimalId(animalToRemoveID);
        animalsList.remove(animalToRemoveId);
    }*/
    /*return null;*/

    @Override
    public String toString() {
        return "Shelter{" +
                "animalsList=" + animalsList +
                ", lastAnID=" + lastAnID +
                '}';
    }
}
