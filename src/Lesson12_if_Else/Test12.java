package Lesson12_if_Else;

public class Test12 {

    static void maximum(int a, int b, int c){

        if(a < b){
            if(b < c){System.out.println(c + " naibilshe chislo");}
            else {System.out.println(b + "naibilshe chislo");}
        } else if (a < c) {
            System.out.println(c + " naibilshe chislo");
        } else {System.out.println(a + " naibilshe chislo");}
    }

    public static void main(String[] args) {
        maximum(24,25,26);
    }
    // && значит И например a > b && a > c  если больше то выдает тру
    // || значит ИЛИ
}


