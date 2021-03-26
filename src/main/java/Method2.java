import java.util.Arrays;

public class Method2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4};
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {4, 4, 4};
        int[] arr3 = {1, 5, 1};
        System.out.println("Массив чисел " + Arrays.toString(arr));
        System.out.println("Результат проверки " + checkNumbers(arr));
        System.out.println("Массив чисел " + Arrays.toString(arr1));
        System.out.println("Результат проверки " + checkNumbers(arr1));
        System.out.println("Массив чисел " + Arrays.toString(arr2));
        System.out.println("Результат проверки " + checkNumbers(arr2));
        System.out.println("Массив чисел " + Arrays.toString(arr3));
        System.out.println("Результат проверки " + checkNumbers(arr3));
    }

    public static boolean checkNumbers(int[] arr) {
        boolean value1 = false;
        boolean value2 = false;

        for (int val : arr) {
            if (val == 1)
                value1 = true;
            else if (val == 4)
                value2 = true;
            else
                return false;
        }

        return value1 && value2;
    }
}
