package sort;

import common.ArraysUtils;

/**
 * @author huangrenhao
 * @date 2019/3/1
 *  冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays();
        ArraysUtils.display(arrays);
        System.out.println("排序后:");
        BobbleSort(arrays);
        ArraysUtils.display(arrays);
    }

    /**
     *  冒泡排序
     * @param arrays
     */
    public static void BobbleSort(Integer[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }

}
