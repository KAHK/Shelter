import java.util.Date;

public class Dog extends Animal {
    private String size;
    private Boolean isSterilizated;
    private String breed;
    public Dog(Integer ID, String name, String adoptionStatus, Integer age, String sex, String size, String breed,
               Boolean isSterilizated, Date admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }
}
