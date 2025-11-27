package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElement_27 {

    public static int removeElement_1(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();
        for (int i : nums){
            if(i!= val){
                list.add(i);
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static int removeElement_2(int nums[], int val){

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(nums);
        System.out.println(k);
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 2;
        removeElement_2(nums,val);
    }
}
