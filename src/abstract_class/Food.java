package abstract_class;

public class Food extends Product{
    private String weight;

    public Food(String weight) {
        this.weight = weight;
    }

    public Food(String name, String weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void getPrice() {

    }

    @Override
    public void getDetails() {

    }

    @Override
    public String toString() {
        return "Food{" +
                super.toString() +
                "weight='" + weight + '\'' +
                '}';
    }
}
