package LeetCode;

import java.util.ArrayList;

public class RemoveDuplicatesArray_26 {

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if(!list.contains(i)) list.add(i);
        }
        System.out.println("положили без дубликтов в лист" + list);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
            System.out.println("в массиве " + nums[i]);
        }

        return list.size();
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2,2,2,2,22,2};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}