package yandexInterview; /**
 * Дан массив целых чисел х длинной N. Массив упорядочен
 * по возрастанию. Написать функцию, которая из этого массива
 * получит массив квадратов чисел, упорядоченный по возрастанию
 * [-3, 2, 4] -> [4, 9, 16]
 */
import java.util.Arrays;

public class ExFromVideo1 {
    public static void main(String[] args) {
        int[] arr = {-3, 2, 4};
        int[] expected = {4, 9, 16};
        int[] result = getX2func(arr);
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println(Arrays.equals(result, expected));
    }

    private static int[] getX2func(int[] arr) {
        int[] result = new int[arr.length];

        int v1 = 0;
        int v2 = arr.length - 1;
        int index = v2;
        while (true) {
            if (v1 == v2) {
                result[index] = arr[v1] * arr[v1];
                break;
            }
            result[index--] = Math.abs(arr[v1]) < Math.abs(arr[v2]) ?
                    arr[v2] * arr[v2--] : arr[v1] * arr[v1++];
        }
        return result;
    }
}
