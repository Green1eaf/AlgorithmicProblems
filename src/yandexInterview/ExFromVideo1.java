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


/**
 * задача: как в неупорядоченном массиве найти диапазон с максимальной суммой?
 */
class Main {

    public static void main() {


        // arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        // Нужно вернуть такой диапазон, где сумма чисел максимальная

        // начало: 3,
        // конец: 6
        // сумма: 6

        // 4, -1, 2, 1 = 6 (Максимальная сумма)


    }


    // Time: O(n) where n is size of arr
    // Space: O(1)
    public static int[] solution(int[] arr) {
        int currentSum = arr[0], maxSum = arr[0];
        int startOfSubstring = 0, endOfSubstring = 0, currentStartOfSubstring = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) { // сравнение текущей суммы с 0.
                currentSum = arr[i];
                currentStartOfSubstring = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) { // сравнение суммы текущей с макс.
                maxSum = currentSum;
                startOfSubstring = currentStartOfSubstring;
                endOfSubstring = i;
            }

        }

        return new int[]{startOfSubstring, endOfSubstring, maxSum};
    }
}
