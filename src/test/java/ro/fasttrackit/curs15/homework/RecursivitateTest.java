package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursivitateTest {
    Recursivitate recursivitate;

    @BeforeEach
    void setup() {
        recursivitate = new Recursivitate();
    }

    @Test
    @DisplayName("WHEN sumInt(0) THEN return 0")
    void testSumInt0() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumInt(0);
        //THEN
        assertThat(received).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN sumInt(1) THEN return 1")
    void testSumInt1() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumInt(1);
        //THEN
        assertThat(received).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN sumInt(10) THEN return 55")
    void testSumInt10() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumInt(10);
        //THEN
        assertThat(received).isEqualTo(55);
    }

    @Test
    @DisplayName("WHEN sumEven(0) THEN return 0")
    void testSumEven0() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumEven(0);
        //THEN
        assertThat(received).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN sumEven(1) THEN return 0")
    void testSumEven1() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumEven(1);
        //THEN
        assertThat(received).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN sumEven(2) THEN return 3")
    void testSumEven2() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumEven(2);
        //THEN
        assertThat(received).isEqualTo(2);
    }

    @Test
    @DisplayName("WHEN sumEven(10) THEN return 30")
    void testSumEven10() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumEven(10);
        //THEN
        assertThat(received).isEqualTo(30);
    }

    @Test
    @DisplayName("WHEN sumEven(11) THEN return 0")
    void testSumEven11() {
        //GIVEN
        //WHEN
        int received = recursivitate.sumEven(11);
        //THEN
        assertThat(received).isEqualTo(0);
    }
}
