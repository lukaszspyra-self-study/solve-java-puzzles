package epam;

public class Casting {

        public static void main(String[] args) {
            loosingData();
            widening();
        }

    private static void loosingData() {
        int big = 1234567899;
        float approx = big;
        System.out.println(big - (int)approx);
    }

    private static void widening() {
        Integer[] a = new Integer[3];
        Long[] b;
        //b = a; not working - integer doesn't extend long

        Integer[] ab = new Integer[3];
        Number[] bb;
        bb = ab; //ok as Integer is subclass of Number
    }

}
