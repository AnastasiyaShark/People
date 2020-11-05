package Builder;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Aнна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(mom);
        Person son = mom.newChildBuilder()
                .setName("Aнтошка")
                .build();
        System.out.println(son);
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
