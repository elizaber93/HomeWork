package HW7_additionalTask.Currencies.dto;


public class USD extends Currency implements ICurrency {
    @Override
    public void printState() {
        System.out.println("USD: "+this.variation+this.value);
    }


    @Override
    public void setCurrency(StringBuilder content) {
        super.setCurrency(content,"USD[a-z<>/\\s=\"_]+[0-9\\.]+[a-z<>/\\s=\"_A-Z]+[+-]");
    }

}
