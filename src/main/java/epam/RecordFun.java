package epam;

public class RecordFun {

    public record Person(String name, String surname, String email){

    }

    public static void main(String[] args) {

        Person person = new Person("Lukasz", "Spyra", "Some private email");
        System.out.println(person.name);

    }



}
