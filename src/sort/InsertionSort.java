package sort;

import common.ArraysUtils;

/**
 * @author huangrenhao
 * @date 2019/3/1
 *  插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays();
        ArraysUtils.display(arrays);
        System.out.println("排序后:");
        InsertionSort(arrays);
        ArraysUtils.display(arrays);
    }

    public static void InsertionSort(Integer[] arrays) {

        int preIndex, current;

        for (int i = 1; i < arrays.length; i++) {

            preIndex = i - 1;
            current = arrays[i];

            while (preIndex >= 0 && arrays[preIndex] > current) {
                arrays[preIndex + 1] = arrays[preIndex];
                preIndex--;
            }
            arrays[preIndex + 1] = current;
        }

    }
}
