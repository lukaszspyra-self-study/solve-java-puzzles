package puzzles.numbers;

public class Algorithms {


    /**
     * Finds biggest common int divisor of two natural numbers excluding 0, using Euclidean algorithm - version with '-' operator
     * <p>
     * Creats
     *
     * @param number1 as int
     * @param number2 as int
     */

    public int findBiggestDivisor(int number1, int number2) {

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


}
