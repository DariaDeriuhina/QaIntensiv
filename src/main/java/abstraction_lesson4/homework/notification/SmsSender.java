package abstraction_lesson4.homework.notification;

public class SmsSender implements Notification{
    private String phone;

    public SmsSender(String phone) {
        this.phone = phone;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms to phone " + phone + ": " + message);
    }
}
