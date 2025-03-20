package slack.inheritance_task;

public class Computer extends Technique {
    private String processor;

    public Computer(String brand, int version, String processor) {
        super("Компьютер", brand, version);
        this.processor = processor;
    }

    public String processor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String turnOnOff() {
        return super.turnOnOff();
    }

    @Override
    public String toString() {
        return super.toString() + ", Процессор: " + processor;
    }
}
