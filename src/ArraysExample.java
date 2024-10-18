import java.util.Arrays;

public class ArraysExample {

    public void createArrays() {
        int[] arr = new int[]{1, 2, 3};
        float[] arr1 = {1.57f, 7.654f, 9.986f};
        char[] chars = {'J', '7', 'a'};
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
        char[] chars1 = {'☺'};
        System.out.println(chars1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(chars));
    }

    public void printArr() {
        int[] arr = new int[5];
        arr[0] = 120;
        arr[1] = 130;
        arr[2] = 140;
        arr[3] = 150;
        arr[4] = 160;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public void printArrBack() {
        int[] arr = new int[5];
        arr[0] = 120;
        arr[1] = 130;
        arr[2] = 140;
        arr[3] = 150;
        arr[4] = 160;
        for (int i = arr.length - 1; i >= 0; i--)
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
    }

    public void printArraysNum() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12, 13, 13};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

