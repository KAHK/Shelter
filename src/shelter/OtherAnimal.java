package shelter;

public class OtherAnimal extends Animal {
    private String species;
    public OtherAnimal(Integer ID, String name,  String species, String adoptionStatus, Integer age, String sex,
                       String admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}