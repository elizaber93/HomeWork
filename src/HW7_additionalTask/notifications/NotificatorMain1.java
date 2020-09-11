package HW7_additionalTask.notifications;

import HW7_additionalTask.notifications.dto.Content;
import HW7_additionalTask.notifications.dto.Recipient;
import HW7_additionalTask.notifications.dto.Sender;
import HW7_additionalTask.notifications.dto.api.IContent;
import HW7_additionalTask.notifications.dto.api.IRecipient;
import HW7_additionalTask.notifications.dto.api.ISender;
import HW7_additionalTask.notifications.service.api.INotificator;

public class NotificatorMain1 {
    public static void main(String[] args) {
        INotificator notificator = new EmailNotificator();
        IRecipient recipient = new Recipient();
        recipient.setAddress("elizaber@yandex.ru");
        ISender sender = new Sender();
        sender.setAddress("gvozdovskaya.el@yandex.ru");
        IContent content = new Content();
        content.setBody("Привет!");
        //notificator = new RepeatNotificator(new ViberNotificator());
        /*
        while (true) {
            if (notificator.send(sender, recipient, content)) {
                break;
            }
        }*/
        //5 попыток отправки уведомления
        for (int i = 0; i < 5; i++) {
            if (notificator.send(sender, recipient, content)) {
                break;
            }
        }
        boolean isSend = notificator.send(sender, recipient, content);
        if (!isSend) {
            notificator = new ViberNotificator();
            recipient = new Recipient();
            recipient.setAddress("adr_rec");
            sender = new Sender();
            sender.setAddress("send_addr");
            isSend = notificator.send(sender, recipient, content);
        }
    }
}
