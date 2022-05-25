import java.util.Arrays;

public class Fibonacci {

    public static int[] fibonacci(int number) {

        if (number <= 1)
            return new int[]{1};
        int[] fibArray = new int[number];
        int a = 0;
        int b = 1;
        int c = b;
        fibArray[0] = 1;
        int i = 1;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
            fibArray[i] = c;
            i++;
        }

        int[] fibArrayWithActualSize = new int[i];

        for (int j = 0; j < i; j++) {
            fibArrayWithActualSize[j] = fibArray[j];
        }

        return fibArrayWithActualSize;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Fibonacci.fibonacci(0)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(1)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(-1)));
        System.out.println(Arrays.toString(Fibonacci.fibonacci(14)));
    }
}