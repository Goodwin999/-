public class Cycles {

    public void printIntegers() {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

    }

    public void printIntegers1() {
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

    }

    public void printIntegers2() {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public void printIntegers3() {
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public void countLeapYear() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }


    public void printNumbersSequentially() {
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public void printNumbersSequentially1() {
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public void countTheSum() {
        int sum = 29000;
        int totalSum = 0;
        int year = 12;
        for (int i = 1; i <= year; i++) {
            totalSum = totalSum + sum;
            System.out.println("Месяц " + i + " сумма накомплений равна " + totalSum + " рублей");
        }
    }

    public void countTheSum1() {
        int sum = 29000;
        double totalSum = 0;
        int year = 12;
        double percent = 0.01;
        for (int i = 1; i <= year; i++) {
            totalSum += sum;
            totalSum += totalSum * percent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSum + " рублей");
        }
    }

    public void multiplicationTable() {
        int result = 2;
        for (int i = 1; i <= 10; i++) {
            int result1 = result * i;
            System.out.println(result + " * " + i + " = " + result1);
        }
    }


}


