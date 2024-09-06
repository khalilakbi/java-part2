package access_modifier;

public class Employer {

    protected int id;
    private String name;


    public void work() {

    }

    void getSalary() { // this default

    }

    protected String getName() {
        return name;
    }
}
