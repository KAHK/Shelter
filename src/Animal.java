import java.util.Date;
public abstract class Animal {
    private Integer ID;
    private String name;
    private String adoptionStatus;
    private Integer age;
    private String sex; //boolean?
    private Date admissionDate;
    private String other; //room to place another important info like treatment
    //private Date adoptionDate;?

    public Animal(Integer ID, String name, String adoptionStatus, Integer age, String sex, Date admissionDate, String other) {
        this.ID = ID;
        this.name = name;
        this.adoptionStatus = adoptionStatus;
        this.age = age;
        this.sex = sex;
        this.admissionDate = admissionDate;
        this.other = other;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", adoptionStatus='" + adoptionStatus + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", admissionDate=" + admissionDate +
                ", other='" + other + '\'' +
                '}';
    }
    public Integer getAnimalID() {
        return ID;
    }
}

