package oop.inheritance;

public class Phone extends TechniqueTask {
    private String importState;
    private int memory;

    public Phone(String marca, int price, String importState, int memory) {
        super(marca, price);
        this.importState = importState;
        this.memory = memory;
    }

    public String importState() {
        return importState;
    }

    public int memory() {
        return memory;
    }

    public void setImportState(String importState) {
        this.importState = importState;
    }

    public void setMemory(int memory) {
        this.memory = memory;

    }

    @Override
    public void ShopName(String name) {
        super.ShopName(name);
    }

    @Override
    public String toString() {
        return "Phone" +
                super.toString() +
                "\nmemory = " + memory +
                "\nimport State = " + importState ;

    }
}
