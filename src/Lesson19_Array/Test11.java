package Lesson19_Array;

import java.util.Arrays;

public class Test11 {

     static int[] array(int [] arrayTest) {

         Arrays.sort(arrayTest);
         return arrayTest;
     }

    public static void main(String[] args) {
        int [] arrayList = {10,6,1,6,7,9,10,11,12,13,14,15,16,166};

         int [] b = array(arrayList);
         System.out.println(Arrays.toString(b));

    }
}

