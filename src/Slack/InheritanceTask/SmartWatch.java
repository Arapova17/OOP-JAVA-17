package Slack.InheritanceTask;

import OOP.Inheritance.Technique;

public class SmartWatch extends Technique {
    private String marcaSmartWatch;

    public SmartWatch(String marca, int price, String marca1) {
        super(marca, price);
        this.marcaSmartWatch = marca1;
    }

    @Override
    public String marca() {
        return marcaSmartWatch;
    }

    @Override
    public void setMarcaSmartWatch(String marcaSmartWatch) {
        this.marcaSmartWatch = marcaSmartWatch;
    }


}
