package slack.inheritance_task.Task4;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private String bankAccount;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address, String bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String fullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String bankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double living(int studentMoney){
        double month = 5000;
        System.out.println("Living: " + studentMoney / month);
        return studentMoney;
    }


}
