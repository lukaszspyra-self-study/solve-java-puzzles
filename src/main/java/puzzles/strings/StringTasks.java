package puzzles.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringTasks {


    public int calculateDots(String word) {

        if (word == null) {
            return 0;
        }

        return (int) word.chars()
                .mapToObj(a -> (char) a)
                .filter(b -> b.equals('.')).count();

    }


    public boolean checkRepeatableLetters1stVersion(String word){

        if (word == null || word.isEmpty()) {
            return false;
        }

        char[] chars = word.toCharArray();


        List<Character> characterList = word.chars()
                .distinct()
                .mapToObj(a -> (char) a)
                .collect(Collectors.toList());

        return characterList.size() != chars.length;
    }


}
