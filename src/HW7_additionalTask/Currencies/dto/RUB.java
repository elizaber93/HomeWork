package HW7_additionalTask.Currencies.dto;

public class RUB extends Currency implements ICurrency{
    @Override
    public void printState() {
        System.out.println("RUB: "+this.variation+this.value);
    }

    @Override
    public void setCurrency(StringBuilder content) {
        super.setCurrency(content,"rub[<>/a-z]+100[<>/a-z\\s=\"_]+[0-9\\.]+[a-z<>/\\s=\"_A-Z]+[+-]");
    }
}
