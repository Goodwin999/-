import java.lang.ArithmeticException;

public class ExceptionMyExample {
    public void divide(int a, int b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя сучий пёс");
            }
            System.out.println("Результат равен " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void nullPointerExceptionExample(String str) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Строка str равна null");
        }

    }

    public void nullPointerExceptionExampleTwo(String str1) {
        if (str1 != null) {
            System.out.println("Длина строки str1: " + str1.length());
            System.out.println("Строка str1 содержит " + str1);
        } else {
            System.out.println("Ошибка: строка str1 равна null");
        }
    }

    public void printExceptionExample(int [] numbers) {
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс массива вне допустимого диапазона");
        }

    }
}
