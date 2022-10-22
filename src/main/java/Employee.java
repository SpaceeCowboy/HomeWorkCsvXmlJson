public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String country;
    private int age;

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    public Employee() {
    }

    public String toString() {
        return " id -> " + id + "\n"
                + " firstname -> " + firstName + "\n"
                + " lastname -> " + lastName + "\n"
                + " country -> " + country + "\n"
                + " age -> " + age;
    }

}
