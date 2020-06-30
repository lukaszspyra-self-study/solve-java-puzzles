package puzzles.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringTasksTest {


    @Test
    void testCalculateOuterDots() {

        //Having
        StringTasks stringTasks = new StringTasks();

        //When
        String word1 = ".word.";
        String word2 = "..word..";
        String word3 = ".word";
        String word4 = "word.";

        //Then
        assertAll(
                () -> assertEquals(2, stringTasks.calculateDots(word1)),
                () -> assertEquals(4, stringTasks.calculateDots(word2)),
                () -> assertEquals(1, stringTasks.calculateDots(word3)),
                () -> assertEquals(1, stringTasks.calculateDots(word4))
        );
    }


    @Test
    void testCalculateInnerDots() {

        //Having
        StringTasks stringTasks = new StringTasks();

        //When
        String word1 = "w.o.r.d";
        String word2 = "w..or..d";
        String word3 = "wo...rd";
        String word4 = "w..or.d";

        //Then
        assertAll(
                () -> assertEquals(3, stringTasks.calculateDots(word1)),
                () -> assertEquals(4, stringTasks.calculateDots(word2)),
                () -> assertEquals(3, stringTasks.calculateDots(word3)),
                () -> assertEquals(3, stringTasks.calculateDots(word4))
        );
    }

    @Test
    void testCalculateNoDots() {

        //Having
        StringTasks stringTasks = new StringTasks();

        //When
        String word1 = "word";
        String word2 = " wo_rd ";
        String word3 = "";
        String word4 = "węęęor&%20d";

        //Then
        assertAll(
                () -> assertEquals(0, stringTasks.calculateDots(word1)),
                () -> assertEquals(0, stringTasks.calculateDots(word2)),
                () -> assertEquals(0, stringTasks.calculateDots(word3)),
                () -> assertEquals(0, stringTasks.calculateDots(word4))
        );
    }

    @Test
    void testCalculateEdgeConditions() {

        //Having
        StringTasks stringTasks = new StringTasks();

        //When
        String word1 = "(#@$.w_..or%#d";
        String word2 = " ... ";
        String word3 = ".._____.:";
        String word4 = ".ę€ół.*.";
        String word5 = null;

        //Then
        assertAll(
                () -> assertEquals(3, stringTasks.calculateDots(word1)),
                () -> assertEquals(3, stringTasks.calculateDots(word2)),
                () -> assertEquals(3, stringTasks.calculateDots(word3)),
                () -> assertEquals(3, stringTasks.calculateDots(word4)),
                () -> assertEquals(0, stringTasks.calculateDots(word5))
        );
    }

    @Test
    void testCheckRepeatableLetters() {

        //Having
        StringTasks stringTasks = new StringTasks();

        //When
        String word1 = "adcfg";
        String word2 = "abndka";
        String word3 = "ęłófdł";
        String word4 = "";
        String word5 = null;

        //Then
        assertAll(
                () -> assertFalse(stringTasks.checkRepeatableLetters(word1)),
                () -> assertTrue(stringTasks.checkRepeatableLetters(word2)),
                () -> assertTrue(stringTasks.checkRepeatableLetters(word3)),
                () -> assertFalse(stringTasks.checkRepeatableLetters(word4)),
                () -> assertFalse(stringTasks.checkRepeatableLetters(word5))
        );

    }
}