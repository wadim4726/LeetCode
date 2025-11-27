package LeetCode;

public class LengthOfWord {

    public static int lenghtOfLastWord_1(String s){

        StringBuilder sb1 = new StringBuilder(s);
        while(sb1.charAt(sb1.length() -1) == ' '){
            sb1.deleteCharAt(sb1.length() -1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = sb1.length() -1; i >= 0 ; i--) {
            if(sb1.charAt(i) == ' '){
                break;
            }
            sb.append(sb1.charAt(i));
        }
        sb.reverse();
        System.out.println(sb.toString());
        return sb.length();
    }

    public static int lenghtOfLastWord(String s){

        int i = s.length()-1;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
         int length = 0;

        while (i>=0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        int i = lenghtOfLastWord("vadim vadimsss ");
        System.out.println(i);
    }
}
