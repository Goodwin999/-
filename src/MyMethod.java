public class MyMethod {
    public void checkOfLeapYear(int year) {

        if ((year > 1584) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
    }

    public void checkOS(int clientOCC, int yearOfCreation) {
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
    }

    public int checkDeliveryDays(int deliveryDistance) {
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
        return deliveryDistance;
    }
}