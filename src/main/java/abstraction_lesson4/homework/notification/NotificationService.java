package abstraction_lesson4.homework.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notification> baseOfServices = new ArrayList<>();

    public void subscribe(Notification notification){
        baseOfServices.add(notification);
    }

    public void unsubscribe(Notification notification){
        baseOfServices.remove(notification);
    }

    public void notifyAllServices(String text){
        for(Notification notification: baseOfServices){
            notification.sendNotification(text);
        }
    }

}
