package shelter;

import java.util.Date;

public class OtherAnimal extends Animal {
    private String species;
    public OtherAnimal(Integer ID, String name, String species, String adoptionStatus, Integer age, Boolean sex,
                       Date admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getClassIdentifier() { return "OtherAnimal"; }
}