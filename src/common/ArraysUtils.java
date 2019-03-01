package common;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author huangrenhao
 * @date 2019/3/1
 */
public class ArraysUtils {

    public static Integer[] arrays() {
        return arrays(10);
    }


    public static Integer[] arrays(int length) {

        Set<Integer> numberSet = new HashSet<>();
        Integer[] result = new Integer[length];
        Random random = new Random();

        while (numberSet.size() < length) {

            int num = random.nextInt(500);
            if (!numberSet.contains(num)) {
                numberSet.add(num);
                result[numberSet.size() - 1] = num;
            }
        }

        return result;
    }

    public static void display(Integer[] arrays) {
        for (Integer num : arrays) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
