public class Homework_lesson2 {
    private static boolean twonumbers(int a, int b) {
        int sum = a + b;
        return a + b <= 20 && sum >= 10;


    }

    private static void isPositiveOrNegative(long variable) {
        System.out.println(variable >= 0 ? "Positive" : "Negative");
    }

    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void println(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }

    }

    static void printYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    private static boolean isLeapYear(int year) {
        if (((year % 4) == 0) && !((year % 100) == 0)) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        }
        return false;

    }
}

