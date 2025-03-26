package slack.polymorphism_task3;

public class MyPhone {
    private String model;
    private int memory;

    public MyPhone() {
    }

    public MyPhone(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int memory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "MyPhone" +
                "\nmodel = " + model +
                "\nmemory = " + memory;
    }
}
