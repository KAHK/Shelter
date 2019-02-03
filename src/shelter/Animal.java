package shelter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    private Integer ID;
    private String name;
    private String adoptionStatus;
    private Integer age;
    private Boolean sex;
    private Date admissionDate;
    private String other;
    public List<Animal> animalsList = new ArrayList<>();

    public Animal(Integer ID, String name, String adoptionStatus, Integer age, Boolean sex, Date admissionDate,
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) { this.sex = sex; }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
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
        return "\nshelter.Animal{" +
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

    public String getClassIdentifier() { return "Animal"; }
}

