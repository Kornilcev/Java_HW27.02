package lesson11;

public class Lesson11HomeWork {
    public static String getSecondWord(String s) {
        if(s == null) {
            return null;
        }
        String [] words = s.split(" ");
        if(words.length < 2) {
            return null;
        }
        return words[1];
    }
}
