import java.util.Arrays;

public class MemoryInJavaExample {
    public void changeValue(int value) {
        value = 22;
        System.out.println("Значение внутри метода changeValue: " + value);
    }

    public void changeValue1(Integer value) {
        value = 22;
        System.out.println("Значение внутри метода changeValue1: " + value);
    }

    public void changeValue2(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println("Значение внутри метода changeValue2: " + Arrays.toString(value));
    }
    public void changeValue3(Integer[] value) {
        value[0] = 99;
        System.out.println("Значение внутри метода changeValue3: " + Arrays.toString(value));
    }







}
