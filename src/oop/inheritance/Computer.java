package oop.inheritance;

import slack.inheritance_task.Technique;

public class Computer extends Technique {
    private String marcaComputer;

    public Computer(String name, String brand, int version, String marca) {
        super(name, brand, version);
        this.marcaComputer = marca;
    }

    public String marca() {
        return marcaComputer;
    }

    public void setMarcaComputer(String marcaComputer) {
        this.marcaComputer = marcaComputer;
    }
}
