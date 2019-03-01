package sort;

import common.ArraysUtils;

/**
 * @author huangrenhao
 * @date 2019/3/1
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays();
        ArraysUtils.display(arrays);
        System.out.println("排序后:");
        SelectionSort(arrays);
        ArraysUtils.display(arrays);
    }

    /**
     * 选择排序
     *
     * @param arrays
     */
    public static void SelectionSort(Integer[] arrays) {

        for (int i = 0; i < arrays.length; i++) {

            int miniIndex = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[miniIndex]) {
                    miniIndex = j;
                }
            }

            int temp = arrays[miniIndex];
            arrays[miniIndex] = arrays[i];
            arrays[i] = temp;
        }

    }

}
