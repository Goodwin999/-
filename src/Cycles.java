import java.text.DecimalFormat;

public class Cycles {
    DecimalFormat dF = new DecimalFormat("#.##");

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
        System.out.println(totalSum);
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

    public void countTheSum2() {
        int sum = 0;
        int month = 0;
        int contribution = 15000;
        double totalSum = 2459000;
        while (sum <= totalSum) {
            month++;
            sum = sum + contribution;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public void printNumber() {
        int i = 0;
        int g = 10;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; g > 0; g--) {
            System.out.print(g + " ");
        }
    }


    public void calculatePopulation() {
        int countryPopulation = 12000000;
        int yearPopulation = 0;
        int childBirthYear = (countryPopulation / 1000) * 17; // 204000 ебальников рождается в год
        int deathYear = (countryPopulation / 1000) * 8; // 96000 умирают в год
        int incrementPopulation = childBirthYear - deathYear; // прирост в год составляет 108000
        while (yearPopulation < 10) {
            countryPopulation = countryPopulation + incrementPopulation;
            yearPopulation++;
            System.out.println("Год " + yearPopulation + " численность населения " + countryPopulation);

        }
    }

    public void calculatePopulationTwo() {
        int countryPopulation = 12000000;
        int year = 10;
        int childBirthYear = (countryPopulation / 1000) * 17; // 204000 ебальников рождается в год
        int deathYear = (countryPopulation / 1000) * 8; // 96000 умирают в год
        int incrementPopulation = childBirthYear - deathYear; // прирост в год составляет 108000
        for (int years = 1; years <= year; years++) {
            countryPopulation = countryPopulation + incrementPopulation;
            System.out.println("Год " + years + " численность населения " + countryPopulation);

        }
    }

    public void countSavings() {
        float percent = 0.07f;
        float startSum = 15000f;
        int counterMonth = 0;
        int targetSum = 12000000;
        while (startSum < targetSum) {
            counterMonth++;
            startSum = startSum + startSum * percent;
            System.out.println("В месяце " + counterMonth + " накоплено " + dF.format(startSum) + " рублей");
        }
        System.out.println("Сумму " + targetSum + " Василий будет копить " + counterMonth + " месяцев");
    }

    public void countSavingsTwo() {
        float percent = 0.07f;
        float startSum = 15000f;
        int counterMonth = 0;
        int targetSum = 12000000;
        while (startSum < targetSum) {
            counterMonth++;
            startSum = startSum + startSum * percent;
            if (counterMonth % 6 == 0) {
                System.out.println("В месяце " + counterMonth + " накоплено " + dF.format(startSum) + " рублей");
            }

        }
        System.out.println("Сумму " + targetSum + " Василий будет копить " + counterMonth + " месяцев");
    }

    public void countSavingsThree() {
        float percent = 0.07f;
        float startSum = 15000f;
        int counterMonth = 0;
        int targetSum = 12000000;
        int mountInYears = 12 * 9; // количество месяцев в 9 годах всего 108
        while (counterMonth < mountInYears) {
            counterMonth++;
            startSum = startSum + startSum * percent;
            if (counterMonth % 6 == 0) {
                System.out.println("В месяце " + counterMonth + " накоплено " + dF.format(startSum) + " рублей");
            }
        }
        System.out.println("Сумму " + targetSum + " Василий будет копить " + counterMonth + " месяцев");
    }

    public void calculateDaysOfTheMonth() {
        int friday = 4;
        int dayInMonth = 31;
        while (friday <= dayInMonth) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    public void calculateCometYears() {
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometInterval = 79;
        for (int year = 0; year <= endYear; year += cometInterval) {
            if (year >= startYear && year <= endYear) {
                System.out.println(year);
            }
        }
    }


}




