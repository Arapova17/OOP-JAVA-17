package Inheritance;

public class laptop extends Technique {
    private String importState;
    private int memory;

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
    public String toString() {
        return "laptop" +
                "\nimport State = " + importState +
                "\nmemory = " + memory ;
    }
}
