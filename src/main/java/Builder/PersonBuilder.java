package Builder;

public class PersonBuilder {

    String name;
    String surname;
    int age;
    String address;


    public PersonBuilder() {
        age = Person.noAge;
        this.name = Person.unknown;
        this.surname = Person.unknown;
        this.address = Person.unknown;
    }

    public PersonBuilder setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Wrong name!");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Wrong surname!");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wrong age!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Wrong address!");
        }
        this.address = address;
        return this;
    }

    public Person build() {
        if (name.equals(Person.unknown) || surname.equals(Person.unknown)) {
            throw new IllegalStateException("Wrong name or Surname");
        }
        Person person = new Person(name, surname, age, address);

        return person;
    }

}
