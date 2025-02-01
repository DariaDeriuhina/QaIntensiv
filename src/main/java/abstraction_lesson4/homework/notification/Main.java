package abstraction_lesson4.homework.notification;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(new SmsSender("09976655"));
        notificationService.subscribe(new EmailSender("train@gmail.com"));

        notificationService.notifyAllServices("Hello, this is a message about new sales");
    }
}
