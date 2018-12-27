import java.util.Date;

public class Cat extends Animal {

    private Boolean isSterilizated;
    private String breed;
    public Cat(Integer ID, String name, String adoptionStatus, Integer age, String sex, String breed,
               Boolean isSterilizated, Date admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }
}
