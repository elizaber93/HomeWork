package HW7_additionalTask.notifications.dto;

import HW7_additionalTask.notifications.dto.api.ISender;

public class Sender implements ISender {
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
