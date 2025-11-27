package Lesson_0;

public class Main {
    public static void main(String[] args) {

        summa vadim = new summa();
        vadim.sum();

    }
}

class summa {

    void sum(int a1, int b1, int c1, int d1){
        int s = sum(a1,b1,c1) + d1;

        System.out.println(" 1 method " + s);

    }

    int sum (int a, int b, int c){
        int s = a + b + c;
        System.out.println(" 2 method " + s);
        return s;
    }

    void sum(){
        System.out.println(" 3 method  0 " );
    }
}