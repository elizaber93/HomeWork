package HW7_additionalTask.notifications;

import HW7_additionalTask.notifications.dto.api.IContent;
import HW7_additionalTask.notifications.dto.api.IRecipient;
import HW7_additionalTask.notifications.dto.api.ISender;
import HW7_additionalTask.notifications.service.api.INotificator;
import org.w3c.dom.ls.LSOutput;

public class EmailNotificator implements INotificator {
    @Override
    public boolean send(ISender sender, IRecipient recipient, IContent content)
    {
        System.out.println("Соединение с stmp сервером");
        System.out.println("Autorization");
        System.out.println("Sendint email");
        System.out.println("recipient" + recipient.getAddress());

        return false;
    }
}
