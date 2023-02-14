package pack;

import java.time.LocalDate;

public class User {

    private int id;
    private String name;
    private int age;
    private LocalDate birthDate;
    private boolean activated;

    public User() {
    }

    public User(int id, String name, int age, LocalDate birthDate, boolean activated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.activated = activated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", activated=" + activated +
                '}';
    }
}
