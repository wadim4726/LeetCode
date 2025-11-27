package Lesson19_Array;


import java.util.Arrays;

class Solution {

        public int[] twoSum(int[] nums, int target) {
            int a = 0;
            int [] b = new int[2];
            for(int i = 1; i <= nums.length; i++){

                if(nums[a] + nums[i] == target){
                    b[1] = i;
                }

            }
            return b;
        }
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;

            Solution s = new Solution();

            int[] result = s.twoSum(nums,target);
            System.out.println(Arrays.toString(result));
        }
    }



