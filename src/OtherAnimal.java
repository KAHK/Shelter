import java.util.Date;

public class OtherAnimal extends Animal {
    private String species;
    public OtherAnimal(Integer ID, String name,  String species, String adoptionStatus, Integer age, String sex,
                       Date admissionDate, String other) {
        super(ID, name, adoptionStatus, age, sex, admissionDate, other);
    }
}