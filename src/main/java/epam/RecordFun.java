package epam;

class RecordFun {

    public record Person(String name, String surname, String email){

    }

    static void main(String[] args) {

        Person person = new Person("Lukasz", "Spyra", "Some private email");
        System.out.println(person.name);

    }
}
