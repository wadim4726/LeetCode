package LeetCode;

import java.util.ArrayList;

public class PlusOne_66 {

    public static int[] plusOne(int [] digits){

        for(int i = digits.length -1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};


    }
}
