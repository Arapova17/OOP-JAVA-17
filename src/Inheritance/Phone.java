package Inheritance;

public class Phone extends Technique{
    private String importState;
    private int memory;

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
}
