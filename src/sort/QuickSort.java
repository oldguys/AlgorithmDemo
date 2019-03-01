package sort;

import common.ArraysUtils;

/**
 * @author huangrenhao
 * @date 2019/3/1
 */
public class QuickSort {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays(10);
        ArraysUtils.display(arrays);
        System.out.println("排序后:");
        QuickSort(arrays, 0, arrays.length - 1);
        ArraysUtils.display(arrays);
    }

    public static void QuickSort(Integer[] arrays, int left, int right) {

        int partitionIndex;

        if (left < right) {
            partitionIndex = partition(arrays, left, right);
            QuickSort(arrays, left, partitionIndex - 1);
            QuickSort(arrays, partitionIndex+1, right);

        }

    }

    private static int partition(Integer[] arrays, int left, int right) {

        int pivot = left;
        int index = pivot + 1;

        for (int i = index; i <= right; i++) {
            if (arrays[i] < arrays[pivot]) {
                swap(arrays, i, index);
                index++;
            }
        }
        swap(arrays, pivot, index - 1);
        return index - 1;
    }

    private static void swap(Integer[] arrays, int i, int j) {

        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
