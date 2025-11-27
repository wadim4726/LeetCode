package LeetCode;

public class FindeIndexOcceurrence_28 {

    public static int strStr (String hayStack, String needle){
        if(needle.isEmpty()) return 0;
        if(!hayStack.contains(needle)) return -1;

        for (int i = 0; i < hayStack.length() - needle.length(); i++) {

            int j = 0;
            while(j < needle.length() && hayStack.charAt(i + j) == needle.charAt(j)){
                j++;
            }
            if (j == needle.length()){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        strStr("vadim", "dim");
    }
}
