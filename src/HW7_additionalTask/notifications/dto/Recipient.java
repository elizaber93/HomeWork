package HW7_additionalTask.notifications.dto;

import HW7_additionalTask.notifications.dto.api.IRecipient;

public class Recipient implements IRecipient {
    private String address;
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
