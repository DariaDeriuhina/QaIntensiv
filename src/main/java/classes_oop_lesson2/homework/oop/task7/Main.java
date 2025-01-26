package classes_oop_lesson2.homework.oop.task7;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Amen", 3);
        dog.makeSound();

        if(dog instanceof Dog){
            Dog dog1 = (Dog) dog;
            dog1.fetch();
        }
    }

}
