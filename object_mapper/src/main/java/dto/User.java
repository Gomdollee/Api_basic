package dto;

import java.util.List;

public class User {

    private String name;
    private int age;
    private List<Bear> bears;

    public List<Bear> getBears() {
        return bears;
    }

    public void setBears(List<Bear> bears) {
        this.bears = bears;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bears=" + bears +
                '}';
    }
}
