package PaildtomeNumber;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paildrome {

    public static void main(String[] args) {

        System.out.println(isPaildromePositveInteger(123));
    }

    static boolean  isPaildromePositveInteger(int a){

        List<Integer> list = new ArrayList<>();
        List<Integer> listReverse = new ArrayList<>();

        while(a > 0){
            list.addFirst(a % 10);
            listReverse.addFirst(a % 10);
            a = a / 10;
        }
        Collections.reverse(listReverse);
        if (list.equals(listReverse)){
            return true;
        }
    return false;
    }
}
