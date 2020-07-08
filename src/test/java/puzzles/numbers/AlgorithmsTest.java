package puzzles.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlgorithmsTest {

    private Algorithms algorithms;

    @BeforeEach
    void create() {
       this.algorithms = new Algorithms();
    }

    @Test
    void shouldFindBiggestDivisorFor12and6() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(12, 6);

        //then
        assertEquals(6, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorFor192and348() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(192, 348);

        //then
        assertEquals(12, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorFor77and55() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(77, 55);

        //then
        assertEquals(11, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorForPrimes11and7() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(11, 7);

        //then
        assertEquals(1, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorForPrimes12329and22039() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisor(12329, 22039);

        //then
        assertEquals(1, biggestDivisor);
    }

    @Test
    void shouldNotAcceptNumberOutOfScope() {
        //given

        //when
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> algorithms.findBiggestDivisor(0, 22039));

        //then
        assertEquals("Wrong number input", exception.getMessage());
    }

    @Test
    void shouldFindBiggestDivisorFor12and6Modulo() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisorModulo(12, 6);

        //then
        assertEquals(6, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorFor192and348Modulo() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisorModulo(192, 348);

        //then
        assertEquals(12, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorFor77and55Modulo() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisorModulo(77, 55);

        //then
        assertEquals(11, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorForPrimes11and7Modulo() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisorModulo(11, 7);

        //then
        assertEquals(1, biggestDivisor);
    }

    @Test
    void shouldFindBiggestDivisorForPrimes12329and22039Modulo() {
        //given

        //when
        int biggestDivisor = algorithms.findBiggestDivisorModulo(12329, 22039);

        //then
        assertEquals(1, biggestDivisor);
    }

    @Test
    void shouldNotAcceptNumberOutOfScopeModulo() {
        //given

        //when
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> algorithms.findBiggestDivisorModulo(0, 22039));

        //then
        assertEquals("Wrong number input", exception.getMessage());
    }

}