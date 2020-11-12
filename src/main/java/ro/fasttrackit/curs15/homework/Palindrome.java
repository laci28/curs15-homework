package ro.fasttrackit.curs15.homework;

public class Palindrome {
    public String recursiveStringReverse(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            char ultimaLitera = word.charAt(word.length() - 1);
            String result = word.substring(0, word.length() - 1);
            return ultimaLitera + recursiveStringReverse(result);
        }
    }

    public String recursiveFirstAndLast(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            char first = word.charAt(word.length() - word.length());
            char last = word.charAt(word.length() - 1);
            if (first == last && word.length() >= 2) {
                String result = word.substring(1, word.length() - 1);
                return first + recursiveFirstAndLast(result) + last;
            } else {
                return word;
            }
        }
    }
}
