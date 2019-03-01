package search;

import sort.QuickSort;
import common.ArraysUtils;

import java.util.Random;

/**
 * @author huangrenhao
 * @date 2019/3/1
 * 二分查找法
 */
public class BinarySearch {

    public static void main(String[] args) {

        Integer[] arrays = ArraysUtils.arrays(100);
        ArraysUtils.display(arrays);

        QuickSort.QuickSort(arrays, 0, arrays.length - 1);
        ArraysUtils.display(arrays);

        Random random = new Random();
        int i = random.nextInt(99);
        Integer temp = arrays[i];

        System.out.println("随机位置：" + i + "\t 数：" + temp);

        int position = binarySearch(arrays, temp);
        System.out.println("position:\t" + position);
    }

    private static int binarySearch(Integer[] arrays, Integer temp) {

        int low = 0;
        int high = arrays.length - 1;
        while (low <= high) {

            int middle = (low + high) / 2;

            if (arrays[middle] > temp) {
                high = middle;
            } else if (arrays[middle] < temp) {
                low = middle;
            } else {
                return middle;
            }

        }

        return -1;
    }
}
