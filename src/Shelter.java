import java.util.List;
import  java.util.ArrayList;

public class Shelter {
    private List<Animal> animalsList = new ArrayList<>();


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
}
