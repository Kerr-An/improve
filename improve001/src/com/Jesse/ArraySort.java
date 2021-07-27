package com.Jesse;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author （SunJian）Jesse
 * @date 2021/7/26 22:13
 * 冒泡排序：
 * 特点：
 * 每一轮循环后，最大的一个数被交换到末尾，因此，下一轮循环就可以“刨除”最后的数
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36, 65};
        // 排序前
        System.out.println("排序前：" + Arrays.toString(nums));

        // 调用冒泡排序法
        bubbleSort(nums);

        System.out.println("===============");

        // 调用JDK自带的方法
        Arrays.sort(nums);
        System.out.println("JDK自带方法：" + Arrays.toString(nums));

        // 调用sort将序排列方法
        getDescendingSort(nums);
    }

    private static void getDescendingSort(int[] nums) {
        // 首相将int数组转换为数值流
        IntStream stream = Arrays.stream(nums);
        //流中的元素全部装箱，转换为流 ---->int转为Integer
        Stream<Integer> integerStream = stream.boxed();
        // 将数值流转换为数组
        // Integer[]::new，此处new是访问构造方法。
        // 这种写法的调用方法格式为：this::function
        Integer[] integers = integerStream.toArray(Integer[]::new);
        // 降序排序
        Arrays.sort(integers,Collections.reverseOrder());
        System.out.print("降序：");
        for (int n : integers) {
            System.out.print(n+" ");
        }
    }

    // 冒泡排序方法体
    private static void bubbleSort(int @NotNull [] nums) {
        // i表示全部索引
        for (int i = 0; i < nums.length - 1; i++) {
            // j表示出了i之外的索引
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // 交换二者
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        // 排序后
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
