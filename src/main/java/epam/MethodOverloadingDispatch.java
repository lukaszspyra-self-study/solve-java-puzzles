package epam;

import java.math.BigInteger;

class MethodOverloadingDispatch {

    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        quack(a);

        BigInteger aaa = new BigInteger("5");
        Integer bbb = 10;

        var ___ = __();
//        int e = 100;
//        int b = 50;
//        int c = e/b;
//
//        var intVar = 5;
//        long longVar = 5;
    }

    private static String __() {
        return "";
    }

    private static void quack(byte i) {
        System.out.println("byte");
    }

    private static void quack(short i) {
        System.out.println("short");
    }

//    private static void quack(int i) {
//        System.out.println("int");
//    }

//    private static void quack(Integer... i) {
//        System.out.println("int...");
//    }

//    private static void quack(long i) {
//        System.out.println("long");
//    }

    private static void quack(float i) {
        System.out.println("float");
    }

    private static void quack(double i) {
        System.out.println("double");
    }

//    private static void quack(Object i) {
//        System.out.println("object");
//    }
//
//    private static void quack(Integer i) {
//        System.out.println("Big Int");
//    }
//
//    private static void quack(Long i) {
//        System.out.println("Big Long");
//    }

}
