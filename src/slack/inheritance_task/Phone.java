package slack.inheritance_task;

public class Phone extends Technique {
    private String model;

    public Phone(String brand, int version, String model) {
        super("Телефон", brand, version);
        this.model = model;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String turnOnOff() {
        return super.turnOnOff();
    }

    @Override
    public String toString() {
        return super.toString() + ", Модел: " + model;
    }
}

