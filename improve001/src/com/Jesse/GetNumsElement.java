package com.Jesse;

import java.util.Arrays;

/**
 * @author （SunJian）Jesse
 * @date 2021/7/26 下午6:22
 */

/**
 * 获取数组元素
 */
public class GetNumsElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};

        // for
        getElementByFor(num);

        System.out.println("==========");

        // foreach
        getElementByForeach(num);

        System.out.println("==========");

        // Arrays.toString()
        System.out.println(Arrays.toString(num));
    }

    public static void getElementByFor(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            System.out.println(n);
        }
    }

    /**
     * 注意：在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引。
     * 显然for each循环更加简洁。但是，for each循环无法拿到数组的索引，因此，到底用哪一种for循环，取决于我们的需要。
     * @param num
     */
    public static void getElementByForeach(int[] num) {
        for (int n :
                num) {
            System.out.println(n);
        }
    }

    // 使用Arrays.toString()可以快速获取数组内容。
}