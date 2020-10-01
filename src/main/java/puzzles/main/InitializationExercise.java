package puzzles.main;

public class InitializationExercise {




    public InitializationExercise() {
        result += "D";
        result2 += "P";
    }

    String result2 = "O";

    {
        result += "C";
        result2 += "G";
    }



    static String result = "A";

    static {
        result += "B";


    }






    public static void main(String[] args) {
        result += "E";
        System.out.println(result);
        System.out.println(new InitializationExercise().result);
        System.out.println(new InitializationExercise().result);
        System.out.println(new InitializationExercise().result2);
    }

}
