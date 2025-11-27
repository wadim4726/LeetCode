package LeetCode;

public class CliblingStairs_70 {

    public int climbStairs(int n) {

        int result = 0;

        int step1 = 1;
        int step2 = 2;

        for (int i = 0; i <= n ; i++) {
            if(i + step2 == n) result++;
            if(i == n) result++;
        }

        for (int i = 2; i <= n ; i = i + 2) {
            if(i + step1 == n) result++;
            if(i == n) result++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
