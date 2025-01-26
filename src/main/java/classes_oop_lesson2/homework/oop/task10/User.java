package classes_oop_lesson2.homework.oop.task10;

public abstract class User {
    private int id;
    private static int counter = 1;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = counter++;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo(){
        System.out.println("Name of user: " + name + "\n" + "Email of user: " + email + "\n" + "Id of user: " + id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
