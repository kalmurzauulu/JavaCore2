package kurs;

import java.time.LocalDate;

public class Kurs {
    private String name;
    private int id;
    private String teacherName;
    private LocalDate BashtalganKun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public LocalDate getBashtalganKun() {
        return BashtalganKun;
    }

    public void setBashtalganKun(LocalDate bashtalganKun) {
        BashtalganKun = bashtalganKun;
    }

    public Kurs() {
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", BashtalganKun=" + BashtalganKun +
                '}';
    }
}
