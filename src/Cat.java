import java.util.Date;

public class Cat extends Animal {

    private Boolean isSterilizated;
    private String breed;
    public Cat(Integer ID, String name, String adoptionStatus, Integer age, Boolean sex, String breed,
               Boolean isSterilizated, String admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
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
}
