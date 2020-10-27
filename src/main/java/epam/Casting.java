package epam;

public final class Casting {

        public static void main(String[] args) {
            loosingData();
            widening();
        }

    private static void loosingData() {
        int big = 1234567999;
        double approx = big;
        System.out.println(big - (int)approx);

        int small = 128;
        byte narrowedByte = (byte) small;
        char a = 'a';

        System.out.println(narrowedByte);

        float f = 0.27f;
        double d2 = f;
        double d3 = 0.27d;
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
