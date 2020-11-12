package ro.fasttrackit.curs15.homework;

public class Recursivitate {
    public static int sumInt(int num) {
        if (num == 0) {
            return 0;
        } else {
            return sumInt(num - 1) + num;
        }
    }

    public static int sumEven(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 0;
        } else if (num % 2 == 0) {
            return sumEven(num - 2) + num;
        }else {
            return 0;
        }
    }
}
