package classes_oop_lesson2.homework.oop.task7;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void makeSound(){
        System.out.println("Animal makes sound");
    }
}
