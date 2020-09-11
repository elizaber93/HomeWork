package HW7_additionalTask.Currencies.dto;

public class EUR extends Currency implements ICurrency {
    @Override
    public void printState() {
        System.out.println("EUR: "+this.variation+this.value);
    }

    @Override
    public void setCurrency(StringBuilder content) {
        super.setCurrency(content,"EUR[a-z<>/\\s=\"_]+[0-9\\.]+[a-z<>/\\s=\"_A-Z]+[+-]");
    }

}
