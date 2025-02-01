package abstraction_lesson4.homework.notification;

public class EmailSender implements Notification{

    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending on email " + email + ": " + message);
    }
}
