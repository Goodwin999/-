import java.lang.ArithmeticException;

public class ExceptionMyExample {
    public void divide(int a, int b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя сучий пёс");
            }
            System.out.println("Ррезультат " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
