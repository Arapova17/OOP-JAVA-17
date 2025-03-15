package Slack.InheritanceTask;

public class Phone extends Technique {
    private String marcaPhone;

    public Phone(String name, String brand, int version, String marca) {
        super(name, brand, version);
        this.marcaPhone = marca;
    }

    public String marca() {
        return marcaPhone;
    }

    public void setMarcaPhone(String marcaPhone) {
        this.marcaPhone = marcaPhone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "marcaPhone='" + marcaPhone + '\'' +
                '}';
    }
}
