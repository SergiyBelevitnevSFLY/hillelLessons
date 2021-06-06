package lesson12.streams;

public class Author {

    private String name;
    private String surName;
    private int birthYear;


    public Author(String name, String surName, int birthYear) {
        this.name = name;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
