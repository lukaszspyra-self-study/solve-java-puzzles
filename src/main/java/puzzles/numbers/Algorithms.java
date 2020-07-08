package puzzles.numbers;

public class Algorithms {


    /**
     * Finds biggest common int divisor of two natural numbers excluding 0, using Euclidean algorithm - version with '-' operator
     *
     * @param number1 as int
     * @param number2 as int
     */

    public int findBiggestDivisor(int number1, int number2) {

        if (number1 < 1 || number2 < 1) {
            throw new IllegalArgumentException("Wrong number input");
        }

        int difference;

        if (number1 > number2) {

            difference = number1 - number2;
            return findBiggestDivisor(difference, number2);

        } else if (number1 == number2) {

            return number1;

        } else {
            difference = number2 - number1;
            return findBiggestDivisor(difference, number1);
        }
    }


    /**
     * Finds biggest common int divisor of two natural numbers excluding 0, using Euclidean algorithm - version with '%' operator
     *
     * @param number1 as int
     * @param number2 as int
     */

    public int findBiggestDivisorModulo(int number1, int number2) {

        if (number1 < 1 || number2 < 1) {
            throw new IllegalArgumentException("Wrong number input");
        }

        int difference;

        if (number1 > number2) {

            while (number2 != 0) {

                difference = number1 % number2;
                number1 = number2;
                number2 = difference;
            }

            return number1;

        } else {

            while (number1 != 0) {

                difference = number2 % number1;
                number2 = number1;
                number1 = difference;

            }

            return number2;

        }
    }

}
