// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;

class hw1 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 5, 7, 3, 4, 8, 2, 1, 6, 3 };
        int[] sorted = mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] mergeSort(int[] numbers, int begin, int end) {
        if (begin == end)
            return new int[] { numbers[begin] };

        int mid = (begin + end) / 2;
        int[] left = mergeSort(numbers, begin, mid);
        int[] right = mergeSort(numbers, mid + 1, end);

        int[] result = new int[end - begin + 1];

        // устроить слияние двух отсортированных половинок

        int leftIndex = 0;
        int rightIndex = 0;

        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            if (leftIndex >= left.length) // левый массив исчерпан
            {
                result[resultIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length) // правый массив исчерпан
            {
                result[resultIndex] = left[leftIndex++];
            } else if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex++];
            } else {
                result[resultIndex] = right[rightIndex++];
            }
        }

        return result;

    }

}
