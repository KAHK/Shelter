package shelter;

import java.util.ArrayList;
import java.util.List;

public /*abstract*/ class Animal {
    private Integer ID;
    private String name;
    private String adoptionStatus;
    private Integer age;
    private String sex; //boolean?
    private /*Date*/ String admissionDate;
    private String other; //room to place another important info like treatment
    //private Date adoptionDate;?
    public List<Animal> animalsList = new ArrayList<>();

    public Animal(Integer ID, String name, String adoptionStatus, Integer age, String sex, String admissionDate,
                  String other) {
        this.ID = ID;
        this.name = name;
        this.adoptionStatus = adoptionStatus;
        this.age = age;
        this.sex = sex;
        this.admissionDate = admissionDate;
        this.other = other;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) { this.sex = sex; }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "shelter.Animal{" +
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

