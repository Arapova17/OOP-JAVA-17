package OOP.Inheritance;

public class laptop extends Technique {
    private String importState;
    private int memory;

    public laptop(String marca, int price, String importState, int memory) {
        super(marca, price);
        this.importState = importState;
        this.memory = memory;
}

    public String importSate() {
        return importState;
    }

    public void setImportState(String importState) {
        this.importState = importState;
    }

    public int memory() {
        return memory;
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
        return "laptop" +
                super.toString() +
                "\nmemory = " + memory +
                "\nimport State = " + importState ;

    }
}
