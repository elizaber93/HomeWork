package HW7_additionalTask.notifications;

import HW7_additionalTask.notifications.dto.api.IContent;
import HW7_additionalTask.notifications.dto.api.IRecipient;
import HW7_additionalTask.notifications.dto.api.ISender;
import HW7_additionalTask.notifications.service.api.INotificator;

public class RetryNotificator implements INotificator {
     private final INotificator[] notificators;
     public RetryNotificator(INotificator... notificators) {
         this.notificators = notificators;
     }

    @Override
    public boolean send(ISender sender, IRecipient recipient, IContent content) {
    return true;

    }
}
