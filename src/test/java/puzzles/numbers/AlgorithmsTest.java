package puzzles.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void findBiggestDivisorFor12and6() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(12, 6);

        //then
        assertEquals(6, biggestDivisor);
    }

    @Test
    void findBiggestDivisorFor192and348() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(192, 348);

        //then
        assertEquals(12, biggestDivisor);
    }

    @Test
    void findBiggestDivisorFor77and55() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(77, 55);

        //then
        assertEquals(11, biggestDivisor);
    }

    @Test
    void findBiggestDivisorForPrimes11and7() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(11, 7);

        //then
        assertEquals(1, biggestDivisor);
    }

    @Test
    void findBiggestDivisorForPrimes12329and22039() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(12329, 22039);

        //then
        assertEquals(1, biggestDivisor);
    }
}