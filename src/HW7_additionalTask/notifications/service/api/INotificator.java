package HW7_additionalTask.notifications.service.api;

import HW7_additionalTask.notifications.dto.api.IContent;
import HW7_additionalTask.notifications.dto.api.IRecipient;
import HW7_additionalTask.notifications.dto.api.ISender;

/***
 * Контракт отправщика уведомлений
 */
public interface INotificator {
    /***
     * Отправка уведомления
     * @param sender кто оправляет
     * @param recipient кому отправляет
     * @param content содержимое
     * @return
     */
    boolean send(ISender sender, IRecipient recipient, IContent content);
}
