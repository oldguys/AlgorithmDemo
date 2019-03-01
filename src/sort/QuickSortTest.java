package sort;

import common.ArraysUtils;

/**
 * @author huangrenhao
 * @date 2019/3/1
 */
public class QuickSortTest {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays(10);
        ArraysUtils.display(arrays);
        System.out.println("排序后:");
        QuickSortTest(arrays, 0, arrays.length );
        ArraysUtils.display(arrays);
    }

    public static void QuickSortTest(Integer[] arrays, int left, int right) {

        int partition;
        if (left < right) {

            partition = partition(arrays, left, right);
            QuickSortTest(arrays, left, partition - 1);
            QuickSortTest(arrays, partition + 1, right);

        }

    }

    private static int partition(Integer[] arrays, int left, int right) {

        int pivot = left;
        int index = pivot + 1;

        for (int i = index; i < right; i++) {

            if (arrays[i] < arrays[pivot]) {
                swap(arrays, i, index);
                index++; // 最后值可能是 array[size],outOf.....
            }
        }

        swap(arrays, pivot, index-1);
        return index - 1;
    }

    private static void swap(Integer[] arrays, int i, int index) {
        int temp = arrays[i];
        arrays[i] = arrays[index];
        arrays[index] = temp;
    }

}
