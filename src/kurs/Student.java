package kurs;

import java.time.LocalDate;

public class Student {
    public LocalDate tuulganKun;
    public String name;
    private String surname;
    private int age;


    public LocalDate getTuulganKun() {
        return tuulganKun;
    }

    public void setTuulganKun(LocalDate tuulganKun) {
        this.tuulganKun = tuulganKun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        if (age>0)
            return age;
        return 0;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }

    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "tuulganKun=" + tuulganKun +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
