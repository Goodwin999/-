public class ConditionalOperators {


    public String printAgePeople(int age) {
        if (age >= 18) {
            return "Если возраст человека " + age + " он совершеннолетний";
        } else {
            return "Если возраст человека " + age + ", то он не достиг совершеннолетия, нужно немного подождать.";
        }
    }

    public void printAgePeople1(int age) {

        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public String temperatureMessage(int temp) {
        if (temp < 5) {
            return "На улице холодно, нужно надеть шапку";
        } else {
            return "Сегодня тепло, можно идти без шапки";
        }
    }

    int speedDriver = 50;

    public String getSpeedDriver() {
        if (speedDriver > 60) {
            return "Если скорость " + speedDriver + " то придется заплатить штраф";
        } else {
            return "можно ездить спокойно";
        }
    }
    int speed = 180;
    int speed1 = 59;
    public void speedDrivers() {

        if (speed > 60) {
            System.out.println("Не спеши ебанат");
        }

        if (speed1 < 60) {
            System.out.println("Ну ты внатури дед");
        }

    }
}
