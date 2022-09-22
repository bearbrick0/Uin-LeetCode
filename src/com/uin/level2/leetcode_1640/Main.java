package com.uin.level2.leetcode_1640;

import java.util.HashMap;
import java.util.Map;

/**
 * 1640.能否连接形成数组
 * 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组 pieces，其中的整数也 互不相同 。请你以 任意顺序 连接 pieces 中的数组以形成 arr 。但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
 * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
 * 示例 1：
 * <p>
 * 输入：arr = [15,88], pieces = [[88],[15]]
 * 输出：true
 * 解释：依次连接 [15] 和 [88]
 * 示例 2：
 * <p>
 * 输入：arr = [49,18,16], pieces = [[16,18,49]]
 * 输出：false
 * 解释：即便数字相符，也不能重新排列 pieces[0]
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {49, 18, 16};
        int[][] pieces = {{16, 18, 49}};
        System.out.println(canFormArray(arr, pieces));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        for (int i = 0; i < arr.length; ) {
            if (!map.containsKey(arr[i])) {
                return false;
            }

            int[] array = map.get(arr[i]);

            for (int j = 0; j < arr.length; j++, i++) {
                if (arr[i] != array[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
