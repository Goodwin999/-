public class TernaryOperatorExample {

    public void printResultWorkOfTernaryOperator(int age) {
        String yearsWord = getCorrectWordForAge(age);
        String message = age > 18 ? "Проходите отдыхайте" : "Вы не проходите по возрасту";
        System.out.println(message);
        System.out.println("Вам " + age + " " + yearsWord);

    }
    private String getCorrectWordForAge(int age) {
        int lastTwoDigits = age % 100;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            return "лет";
        }
        int lastDigit = age % 10;
        switch (lastDigit) {
            case 1:
                return "год";
            case 2:
            case 3:
            case 4:
                return "года";
            default:
                return "лет";
        }
    }


}
