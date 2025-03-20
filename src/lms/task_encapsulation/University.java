package lms.task_encapsulation;

public class University {
    private String name;
    private String faculty;
    private int contract;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String faculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public University[] createUniversity(University[] universities, University university){
        University[] newUniversity = new University[universities.length + 1];
        int i = 0;
        while (i < universities.length) {

            newUniversity[i] = universities[i];
            i++;
        }
        newUniversity[universities.length] = university;
        return newUniversity;
    }

    @Override
    public String toString() {
        return  "\nUniversity" +
                "\nname = " + name +
                "\nfaculty = " + faculty +
                "\ncontract = " + contract + "\n--------------";
    }
}
