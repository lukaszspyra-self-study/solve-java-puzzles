package epam;

public class Casting {

        public static void main(String[] args) {
            loosingData();
            widening();
        }

    private static void loosingData() {
        int big = 123456799;
        float approx = big;
        System.out.println(big - (int)approx);

        int small = 128;
        byte narrowedByte = (byte) small;
        System.out.println(narrowedByte);
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
