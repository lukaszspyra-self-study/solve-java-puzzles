package epam;

class Human{
    public static void walk()
    {
        System.out.println("Human walks");
    }
}
class Boy extends Human{
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Human obj = new Boy();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        Boy obj3 = new Boy();
        obj.walk(); //static binding to Human
        obj2.walk();
        obj3.walk();

        Human.walk();
        Boy.walk();
    }
}