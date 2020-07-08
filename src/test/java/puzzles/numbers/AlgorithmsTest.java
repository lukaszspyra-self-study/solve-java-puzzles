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
    void findBiggestDivisorFor0and6() {
        //given
        Algorithms algorithms = new Algorithms();

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(12, 6);

        //then
        assertEquals(6, biggestDivisor);
    }
}