package algo.tzashinorpu.WeekContest.D0109;

import org.junit.jupiter.api.Test;

class wordCount_5978Test {

    @Test
    void wordCount() {
        wordCount_5978 ins = new wordCount_5978();
        String[] startWords = {"g", "vf", "ylpuk", "nyf", "gdj", "j", "fyqzg", "sizec"};
        String[] targetWord = {"r", "am", "jg", "umhjo", "fov", "lujy", "b", "uz", "y"};
        System.out.println(ins.wordCount(startWords, targetWord));
    }
}