package HW7_additionalTask.notifications.dto;

import HW7_additionalTask.notifications.dto.api.IContent;

public class Content implements IContent {
    String body;

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return null;
    }
}
