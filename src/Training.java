public class Training {
    public static void main(String[] args) {

        String str = "The category:apperal, category:music, category:games";
        printCategory(str);
        String s = "fhaofsuhgao;sifhoai;";

        for (int i = 0; i < s.length(); i++) {
            int start = s.length() -1 - i;
            System.out.println(s.charAt(start));
        }

        for (int i = 0; i <= 100; i++) {
            if(i%2 ==0) System.out.println(i);
        }

        int res = search(new int[]{1,2,54,5,6,7}, 7);
        System.out.println(res + "result method search" );
        String sa = "Hello";
        System.out.println(allDollars(sa));

    }
    public static void printCategory(String s){

        int i = 0;
        StringBuilder sb = new StringBuilder(s);

        while(sb.indexOf("category:") >= 0){
            int found = sb.indexOf("category:");
            int start = found + 9;

            int end = sb.indexOf(" ", start);
            if(end == -1) end = sb.length();

            System.out.println(sb.substring(start, end));
            sb.delete(found,end);

        }
    }

    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static String allDollars (String s){
       if(s.length() <=1 ){
           return s;
       }else{
           char c = s.charAt(1);
           return s.charAt(0) + "$" + allDollars(s.substring(1));
       }
    }
}
