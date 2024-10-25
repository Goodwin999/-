
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Variable variable = new Variable();
        System.out.println(variable.printResult());
        variable.printResult1();
        System.out.println(variable.printResult2());
        variable.printResult3(25.0, 5.0);
        variable.printResult4();
        variable.printResult5(30, 50, 30);
        System.out.println("ЗАдача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("Задача 1 выполнена");
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("Задача 2 выполнена");
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println("Задача 3 выполнена");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 4 выполнена");
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 5 выполнена");
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerAverageWeight = (boxer1 + boxer2) / 2;
        System.out.println(boxerAverageWeight);
        System.out.println("Задача 6 выполнена");
        System.out.println("Задача 7");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var devisionWeight = weight2 % weight1;
        System.out.println(devisionWeight);
        System.out.println("Задача 7 выполнена");
        System.out.println("Задача 8");
        var workTime = 640;
        var employeeHour = 8;
        var totalEmployee = workTime / employeeHour;
        System.out.println("Всего работников в компании — " + totalEmployee + " человек");
        totalEmployee = totalEmployee + 94;
        workTime = totalEmployee * employeeHour;
        System.out.println("Если в компании работает " + totalEmployee + " человек, то всего " + workTime + " часа работы может быть поделено между сотрудниками");
        System.out.println("Задача 8 выполнена");
        System.out.println("Домашняя работа ПЕРЕМЕННЫЕ выполнена");
        System.out.println("ПЕРЕМЕННЫЕ ч. 2");
        System.out.println("[Задача 1]");
        byte a = 100;
        System.out.println("Значение переменной с типом byte равно " + a);
        short b = 2000;
        System.out.println("Значение переменной с типом short равно " + b);
        int c = 300000;
        System.out.println("Значение переменной с типом int равно " + c);
        long d = 4000000;
        System.out.println("Значение переменной с типом long  равно " + d);
        float e = 5.0000099f;
        System.out.println("Значение переменной с типом float равно " + e);
        double i = 6.5234649;
        System.out.println("Значение переменной с типом double равно " + i);
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        int ludmilaStudent = 23;
        int annushkaStudent = 27;
        int katyStudent = 30;
        int sheetOfPaper = 480;
        int sheetOfPaperResult = sheetOfPaper / (ludmilaStudent + katyStudent + annushkaStudent);
        System.out.println("На каждого ученика рассчитано " + sheetOfPaperResult + " листов бумаги");
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        int machinePerformance = 16;
        int machinePerformanceInMinute = machinePerformance / 2;
        System.out.println("Производительность машины в 1 минуту - " + machinePerformanceInMinute + " бутылок");
        int machinePerformanceIn20Minute = machinePerformanceInMinute * 20;
        System.out.println("За 20 минут машина произвела " + machinePerformanceIn20Minute + " штук бутылок");
        int minuteInADay = 24 * 60;
        System.out.println("В сутках " + minuteInADay + " минут");
        int pMInADay = minuteInADay * machinePerformanceInMinute;
        System.out.println("За сутки машина произвела " + pMInADay + " штук бутылок");
        int pMInA3Day = (minuteInADay * 3) * machinePerformanceInMinute;
        System.out.println("За трое суток машина произвела " + pMInA3Day + " штук бутылок");
        int pMInAMonth = (minuteInADay * 30) * machinePerformanceInMinute;
        System.out.println("За месяц машина произвела " + pMInAMonth + " штук бутылок");
        System.out.println("Задача 4 выполнена");
        System.out.println("[Задача 5]");
        int canOfPaint = 120;
        int paintWhite = 2;
        int paintBrown = 4;
        int totalClasses = canOfPaint / (paintBrown + paintWhite);
        System.out.println("Классов в школе " + totalClasses);
        int paintOfWhite = paintWhite * totalClasses;
        int paintOfBrown = paintBrown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + paintOfWhite + " банок белой краски и " + paintOfBrown + " банок коричневой краски");
        System.out.println("Задача 5 выполнена");
        System.out.println("[Задача 6]");
        int bananaGr = 5 * 80;
        System.out.println("Граммов банана " + bananaGr);
        int milkGr = (200 * 105) / 100;
        System.out.println("Граммов молока " + milkGr);
        int iceCreamGr = 2 * 100;
        System.out.println("Граммов мороженного " + iceCreamGr);
        int eggsGr = 4 * 70;
        System.out.println("Граммов яиц " + eggsGr);
        int totalWeight = bananaGr + milkGr + iceCreamGr + eggsGr;
        System.out.println("Всего количесвто граммов в завтраке составляет : " + totalWeight + " грамм");
        float weightInKg = totalWeight / 1000f;
        System.out.println("В килограмммах спортивный завтрак будет составлять : " + weightInKg);
        System.out.println("Задача 6 выполнена");
        System.out.println("[Задача 7]");
        int weightSportsmanInGram = 7 * 1000;
        int diet1 = 250;
        int diet2 = 500;
        System.out.println("Вес в граммах, который необходимо кинуть спортсмену сотавляет " + weightSportsmanInGram);
        int daysToLoseWeight = weightSportsmanInGram / diet1;
        System.out.println("При ежедневной потере 250 грамм спортсмен сбросит 7 кг через " + daysToLoseWeight + " дней");
        int daysToLoseWeight2 = weightSportsmanInGram / diet2;
        System.out.println("При ежедневной потере 500 грамм спортсмен сбросит 7 кг через " + daysToLoseWeight2 + " дней");
        int daysOfAverage = (daysToLoseWeight + daysToLoseWeight2) / 2;
        System.out.println("В среднем что бы похудеть необходимо " + daysOfAverage + " дней");
        System.out.println("Задача 7 выполнена");
        System.out.println("[Задача 8]");
        int mashaSalary = 67760;
        System.out.println("До повышения зарплата Маши в месяц " + mashaSalary);
        int denisSalary = 83690;
        System.out.println("До повышения зарплата Дениса в месяц " + denisSalary);
        int krisSalary = 76230;
        System.out.println("До повышения зарплата Кристины в месяц " + krisSalary);
        int salaryIncreaseMasha = (mashaSalary * 10) / 100 + mashaSalary;
        System.out.println("После повышения Маша стала получать в месяц " + salaryIncreaseMasha);
        int salaryIncreaseDenis = (denisSalary * 10) / 100 + denisSalary;
        System.out.println("После повышения Дениска стал получать в месяц " + salaryIncreaseDenis);
        int salaryIncreaseKris = (krisSalary * 10) / 100 + krisSalary;
        System.out.println("После повышения Кристина  стала получать в месяц " + salaryIncreaseKris);
        int salaryMashaOfYear = mashaSalary * 12;
        System.out.println("До повышения Маша получала в год " + salaryMashaOfYear);
        int salaryDenisOfYear = denisSalary * 12;
        System.out.println("До повышения Денис получал в год " + salaryDenisOfYear);
        int salaryKrisOfYear = krisSalary * 12;
        System.out.println("До повышения Кристина получала в год " + salaryKrisOfYear);
        int mashaSalaryOfYearLast = salaryIncreaseMasha * 12;
        System.out.println("После повышения за год Маша получает " + mashaSalaryOfYearLast);
        int denisSalaryOfYearLast = salaryIncreaseDenis * 12;
        System.out.println("После повышения за год Денис получает " + denisSalaryOfYearLast);
        int krisSalaryOfYearLast = salaryIncreaseKris * 12;
        System.out.println("После повышения за год Кристина получает " + krisSalaryOfYearLast);
        int differenceMashaSalaryOfYear = mashaSalaryOfYearLast - salaryMashaOfYear;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " в месяяц, годовой доход вырос на " + differenceMashaSalaryOfYear);
        int differenceDenisSalaryOfYear = denisSalaryOfYearLast - salaryDenisOfYear;
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " в месяяц, годовой доход вырос на " + differenceDenisSalaryOfYear);
        int differenceKrisSalaryOfYear = krisSalaryOfYearLast - salaryKrisOfYear;
        System.out.println("Кристина теперь получает " + salaryIncreaseKris + " в месяц, годовой доход вырос на " + differenceKrisSalaryOfYear);
        System.out.println("Задача 8 выполнена");
        System.out.println("[Тема условные операторы]");
        System.out.println("[Задача 1]");
        ConditionalOperators conditionalOperators = new ConditionalOperators();
        System.out.println(conditionalOperators.printAgePeople(21));
        System.out.println(conditionalOperators.printAgePeople(17));
        System.out.println("Задача 1 выполнена");
        System.out.println("Задача 1 другое решение");
        conditionalOperators.printAgePeople1(18);
        conditionalOperators.printAgePeople1(12);
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        System.out.println(conditionalOperators.temperatureMessage(4));
        String message = conditionalOperators.temperatureMessage(6);
        System.out.println(message);
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        System.out.println(conditionalOperators.getSpeedDriver());
        conditionalOperators.speedDrivers();
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        int age = 20;
        if (age >= 3 && age < 7) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + " лет, то его место в университете.");
        } else if (age > 24) {
            System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу.");
        }
        System.out.println("Задача 4 выполнена");
        System.out.println("[Задача 5]");
        int ageKind = 16;
        if (ageKind < 5) {
            System.out.println("Если ребенку " + ageKind + " лет, то он не может кататься на аттракционе");
        }
        if (ageKind >= 5 && ageKind <= 14) {
            System.out.println("Если ребенку " + ageKind + " лет он может кататься только в сопровождении взрослого");
        }
        if (ageKind > 14) {
            System.out.println("Если ребенку " + ageKind + " лет, можно без взрослого");
        }
        System.out.println("Задача 5 выполнена");
        System.out.println("[Задача 6]");
        int totalPlaces = 102;
        int seats = 60;
        int passenger = 40;
        if (passenger < seats) {
            System.out.println("Есть сидячие места в вагоне.");
        } else if (passenger >= seats && passenger < totalPlaces) {
            System.out.println("Есть стоячие места в вагоне.");
        } else {
            System.out.println("Вагон полностью забит, мест нет.");
        }
        System.out.println("Задача 6 выполнена");
        System.out.println("[Задача 7]");
        int one = 24;
        int two = 24;
        int three = 24;
        if (one > two && one > three) {
            System.out.println("one большее из чисел");
        } else if (two > one && two > three) {
            System.out.println("two большее");
        } else if (three > one && three > two) {
            System.out.println("большее three");
        } else {
            System.out.println("Существет равенство между числами");
        }
        System.out.println("Задача 7 выполнена");
        System.out.println("[Условные операторы ч.2]");
        System.out.println("[Задача из лекции]");
        char color = 'y';
        switch (color) {
            case 'r' -> System.out.println("Красный, иди нахуй");
            case 'y' -> System.out.println("Желтый, приготовиться");
            case 'g' -> System.out.println("Пиздуй бороздуй, и я попиздел нахуй");
            case 'l' -> System.out.println("Поверни налево ебантяй");
            default -> System.out.println("Светофору пизда, можно ехать как араб");
        }
        conditionalOperators.switchCaseExample('r');
        conditionalOperators.switchCaseExample1('l');
        System.out.println("Задача из лекции выполнена");
        System.out.println("[Задача 1]");
        int clientOS = 0;
        switch (clientOS) {
            case 0 -> System.out.println("Установите версию приложения для iOS по ссылке");
            case 1 -> System.out.println("Установите версию приложения для Android по ссылке");
            default -> System.out.println("Не определен тип ОС");
        }
        int clientOSS = 1;
        if (clientOSS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOSS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Не определен тип ОС");
            }
        }
        int clientOC = 1;
        if (clientOC == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Не определен тип ОС");
        }
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        int clientOCC = 1;
        int yearOfCreation = 2014;
        if (clientOCC == 1 && yearOfCreation >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOCC == 1 && yearOfCreation < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (clientOCC == 0 && yearOfCreation >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    if (clientOCC == 0 && yearOfCreation < 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    }
                }
            }
        }
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        int year = 2021;
        if ((year > 1584) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется для доставки 1 день");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дляя доставки 2 дня");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется для доставки 3 дня");
            } else if (deliveryDistance > 100) {
                System.out.println("Доставки нет, соси хуй собака");
            }
        }
        System.out.println("Задача 4 выполнена");
        System.out.println("[Задача 5]");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1 -> System.out.println("Январь, зима");
            case 2 -> System.out.println("Февраль, зима");
            case 3 -> System.out.println("Март, весна");
            case 4 -> System.out.println("Апрель. весна");
            case 5 -> System.out.println("Май, весна");
            case 6 -> System.out.println("Июнь, лето");
            case 7 -> System.out.println("Июль,лето");
            case 8 -> System.out.println("Август, лето");
            case 9 -> System.out.println("Сентябр, осень");
            case 10 -> System.out.println("Октябрь, осень");
            case 11 -> System.out.println("Ноябрь, осень");
            case 12 -> System.out.println("Декабрь, зима");
            default -> System.out.println("Месяц больше 12");
        }
        System.out.println("Задача 5 выполнена");
        System.out.println("Условные операторы ч.2 выполнил все задачи");
        System.out.println("[Циклы]");
        System.out.println("[Задача 1]");
        Cycles cycles = new Cycles();
        cycles.printIntegers();
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        cycles.printIntegers1();
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        cycles.printIntegers2();
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        cycles.printIntegers3();
        System.out.println("Задача 4 выполнена");
        System.out.println("[Задача 5]");
        cycles.countLeapYear();
        System.out.println("Задача 5 выполнена");
        System.out.println("[Задача 6]");
        cycles.printNumbersSequentially();
        System.out.println("Задача 6 выполнена");
        System.out.println("[Задача 7]");
        cycles.printNumbersSequentially1();
        System.out.println("Задача 7 выполнена");
        System.out.println("[Задача 8]");
        cycles.countTheSum();
        System.out.println("Задача 8 выполнена");
        System.out.println("[Задача 9]");
        cycles.countTheSum1();
        System.out.println("Задача 9 выполнена");
        System.out.println("[Задача 10]");
        cycles.multiplicationTable();
        System.out.println("Задача 10 выполнена");
        System.out.println("[Циклы ч. 2]");
        int salary = 65535;
        int total = 0;
        for (int w = 0; total < 1_000_000; w++) {
            total = total + total / 100;
            total = total + salary;
            if (w % 5 == 0) {
                System.out.println("Месяц " + w + " Итого " + total);
            }
        }
        System.out.println(total);
        System.out.println("[Задача 1]");
        cycles.countTheSum2();
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        cycles.printNumber();
        System.out.println();
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        cycles.calculatePopulation();
        System.out.println("Решение с помощью цикла FOR");
        cycles.calculatePopulationTwo();
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        cycles.countSavings();
        System.out.println("Задача 4 выполнена");
        System.out.println("[Задача 5]");
        cycles.countSavingsTwo();
        System.out.println("Задача 5 выполнена");
        System.out.println("[Задача 6]");
        cycles.countSavingsThree();
        System.out.println("Задача 6 выполнена");
        System.out.println("[Задача 7]");
        cycles.calculateDaysOfTheMonth();
        System.out.println("Задача 7 выполнена");
        System.out.println("[Задача 8]");
        cycles.calculateCometYears();
        System.out.println("Задача 8 выполнена");
        System.out.println("[Массивы ч. 1]");
        ArraysExample arraysExample = new ArraysExample();
        System.out.println("[Задача 1]");
        arraysExample.createArrays();
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        arraysExample.printArr();
        System.out.println();
        arraysExample.printArrBack();
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        arraysExample.printArraysNum();
        System.out.println();
        System.out.println("Массивы  ч. 1 выполнена");
        System.out.println("[Массивы ч. 2]");
        System.out.println("[Задача 1]");
        arraysExample.countTheSum();
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        arraysExample.countMinMaxSum();
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        arraysExample.calculationOfAverageAmount();
        System.out.println("Задача 3 выполнена");
        System.out.println("[Задача 4]");
        arraysExample.expandArray();
        System.out.println("Массивы  ч. 2 выполнена");
        System.out.println("[Строки]");
        StringExample string = new StringExample();
        string.printString();
        String street1 = "манежная";
        String streetTrue = street1.replace("м", "М");
        System.out.println(streetTrue);
        System.out.println("[Задача 1]");
        string.printStringName();
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        string.printStringNameUpperCase();
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        string.printStringReplaceSymbol();
        System.out.println("Задача 3 выполнена");
        System.out.println("Строки выполнил");
        System.out.println("[Методы]");
        System.out.println("[Задача 1]");
        MyMethod myMethod = new MyMethod();
        myMethod.checkOfLeapYear(2021);
        System.out.println("Задача 1 выполнена");
        System.out.println("[Задача 2]");
        myMethod.checkOS(0, 2014);
        System.out.println("Задача 2 выполнена");
        System.out.println("[Задача 3]");
        myMethod.checkDeliveryDays(95);
        System.out.println("Задача 3 выполнена");
        System.out.println("Методы выполнил  ");


    }
}

