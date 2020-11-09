package Builder;

public class Person {

    final public static int noAge = -1;
    final public static String unknown = "unknown";

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = noAge;
        this.address = unknown;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = unknown;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.age = noAge;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    public boolean hasAge() {
        if (getAge() != noAge) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (!getAddress().equals(unknown)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChildBuilder = new PersonBuilder()
                .setSurname(getSurname())
                .setAddress(getAddress());
        return newChildBuilder;

    }
}
