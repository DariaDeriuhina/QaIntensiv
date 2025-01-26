package classes_oop_lesson2.homework;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(){}

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student.id==id;
    }

    public int hashCode(){
        return Objects.hash(id);
    }

    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", gpa=" + gpa;
    }

    public Student clone(){
        try{
           return (Student) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError("Cloning not supported", e);
        }
    }


}
