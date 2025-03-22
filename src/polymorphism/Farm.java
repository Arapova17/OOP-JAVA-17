package polymorphism;

import java.util.Arrays;

public class Farm {
    String address;
    Cow[] cows;
    Horse[] horses;
    Sheep[] sheep;
    String ownerName;

    public Farm() {
    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "\nFarm" +
                "\naddress = " + address +
                "\ncows = " + Arrays.toString(cows) +
                "\nhorses = " + Arrays.toString(horses) +
                "\nsheep = " + Arrays.toString(sheep) +
                "\nowner Name = " + ownerName;
    }
}
