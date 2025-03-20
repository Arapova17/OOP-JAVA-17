package modifier.task_user;

public class Electronics extends Product {
    private long id;
    private String brand;
    private String colour;
    private boolean isNew;
    private int memory;

    public Electronics() {
    }

    public Electronics(long id, String brand, String colour, boolean isNew, int memory) {
        this.id = id;
        this.brand = brand;
        this.colour = colour;
        this.isNew = isNew;
        this.memory = memory;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String brand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String colour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int memory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics" +
                "\nid = " + id +
                "\nbrand = " + brand +
                "\ncolour = " + colour +
                "\nisNew = " + isNew +
                "\nmemory = " + memory + "\n";
    }
}
