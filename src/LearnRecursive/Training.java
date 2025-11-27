package LearnRecursive;

public class Training {
    // Factorial
    public static int factorial(int n){
        if(n==0 || n==1) return 1;
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static String reverse(String str){
        if(str.length() <= 1) return str;

        return reverse(str.substring(1) + str.charAt(0));
    }
    // Рекурсия сложно для понимания
    public static boolean isPalindrome(String str){
        if(str.length() <= 1) return true;

        if(str.charAt(0) != str.charAt(str.length() -1)) return false;

        return isPalindrome(str.substring(1,str.length()-1));
    }
}
