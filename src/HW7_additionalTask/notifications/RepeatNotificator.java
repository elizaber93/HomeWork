package HW7_additionalTask.notifications;

import HW7_additionalTask.notifications.dto.api.IContent;
import HW7_additionalTask.notifications.dto.api.IRecipient;
import HW7_additionalTask.notifications.dto.api.ISender;
import HW7_additionalTask.notifications.service.api.INotificator;

public class RepeatNotificator implements INotificator {
    INotificator notificator;
    private final int repeatCount;
    public RepeatNotificator(INotificator notificator, int repeatCount) {
        this.notificator = notificator;
        this.repeatCount = repeatCount;
    }

    @Override
    public boolean send(ISender sender, IRecipient recipient, IContent content) {
        for (int i = 0; i < repeatCount; i++) {
            if (this.notificator.send(sender, recipient, content)) {
                return true;
            }
        }
        return false;
    }
}
