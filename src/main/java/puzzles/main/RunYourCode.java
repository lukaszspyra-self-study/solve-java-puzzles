package puzzles.main;

import java.util.Arrays;

/**
 * Hello world!
 */
public class RunYourCode {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Integer[] test1 = new Integer[]{1, 2, 3, 4};
        Integer[] test2 = new Integer[]{1, 2, 3, 4};
        triple(test1);

        System.out.println(Arrays.toString(test1));

    }

    static void triple(Integer[] integers){

        integers[1] = 2*integers[1];
        integers = new Integer[]{1};
        integers[0] = 2* integers[0];
    }



}
