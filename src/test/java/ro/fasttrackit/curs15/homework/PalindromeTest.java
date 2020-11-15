package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void setup() {
        palindrome = new Palindrome();
    }

    @Test
    @DisplayName("WHEN recursiveFirstAndLast(level) THEN return level")
    void testPal() {
        //GIVEN
        //WHEN
        String rev = palindrome.recursiveStringReverse("level");
        //THEN
        assertThat(rev).isEqualTo("level");
    }

    @Test
    @DisplayName("WHEN recursiveFirstAndLast(level) THEN return level")
    void testtestPal2() {
        //GIVEN
        //WHEN
        String rev = palindrome.recursiveFirstAndLast("level");
        //THEN
        assertThat(rev).isEqualTo("level");
    }

}
