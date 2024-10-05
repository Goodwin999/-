public class Variable {
    int a = 20;
    int b = 40;
    int result = a + b;

    public String printResult() {
        return "Результат сложения: " + result;
    }
    int c = 10;
    int d = 5;
    int result1 = c - d;

    public void printResult1() {
        System.out.println("Результат вычитания: " + result1);
    }
    int e = 5;
    int g = 5;
    int result2 = e * g;

    public String printResult2() {
        return "Результат умножения: " + result2;
    }
    public void printResult3(double f, double i) {
        if (i == 0) {
            System.out.println("Ошибка: на ноль делить нельзя");
        } else {
            double result3 = f / i;
            System.out.println("Результат деления: " + result3);
        }

    }
    int y = 500;
    int j = 150;
    int result4 = y % j;

    public void printResult4() {
        System.out.println("Результат операции остаток от деления:" + result4);
    }
    public void printResult5(int w, int v, int z) {
        int result5 = (w+v)%z;
        System.out.println("Результат операции:" + result5);
    }



}


