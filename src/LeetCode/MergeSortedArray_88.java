package LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] part1 = Arrays.copyOfRange(nums1,0, m);
        int[] part2 = Arrays.copyOfRange(nums2,0, n);

        int [] merged = IntStream.concat(Arrays.stream(part1), Arrays.stream(part2)).sorted().toArray();

        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }
        System.out.println(Arrays.toString(merged));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 0, 0};
        int[] nums2 = {0,1};
        merge(nums1,4,nums2,2);
    }
}
