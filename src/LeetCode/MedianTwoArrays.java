package LeetCode;

import java.util.Arrays;

public class MedianTwoArrays {


    static double findMedianSortedArrays (int nums1[], int nums2[]){
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];

        for (int i = 0; i < totalLength; i++) {
            if(i < nums1.length){
                merged[i] = nums1[i];
            }else {
                merged[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        int mid = totalLength / 2;

        if(totalLength % 2 == 1){
        return merged[mid];
        }else {
            return (merged[mid-1] + merged[mid]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,5,6};
        int[] nums2 = {3,1,4,9,10};
        double b = findMedianSortedArrays(nums1,nums2);
        System.out.println(b);
    }
}
