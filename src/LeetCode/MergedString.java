package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MergedString {
    // George Hotz method is crazy
    public static boolean mergeStringCheck(String s,String s1, String s2){
        if(s.isEmpty()){
            return s1.isEmpty() && s2.isEmpty();
        }

        boolean i1 = !s1.isEmpty() && s1.charAt(0) == s.charAt(0);
        boolean i2 = !s2.isEmpty() && s2.charAt(0) == s.charAt(0);

        if(i1 && i2){
            return mergeStringCheck(s.substring(1),s1.substring(1),s2) ||
                    mergeStringCheck(s.substring(1),s1,s2.substring(1));
        }else if(i1){
           return mergeStringCheck(s.substring(1),s1.substring(1),s2);
        }else if(i2){
           return mergeStringCheck(s.substring(1),s1,s2.substring(1));
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "cdw";
        String s2 = "oears";
        String s = "codewars";

        boolean b = mergeStringCheck(s,s1,s2);
        System.out.println(b);
    }
}
