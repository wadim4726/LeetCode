package LeetCode;

import java.util.*;

public class SeaechInsertPosition_35 {

    public static int searchInsert(int[] nums, int target) {

        Set<Integer> set = new TreeSet<>();
        set.add(target);
        for(int i : nums){
            set.add(i);
        }
        System.out.println(set);
        int index = 0;

        for(int i : set){
           if(i==target){
               System.out.println(index);
               return index;
           }
           index++;
        }

        return index;
    }

    public static void main(String[] args) {
        int [] nums = {1,4,5,6,78,9};
        int target = 9;
        searchInsert(nums,target);
    }
}
