package Lesson8_FinalStatic;

public class Lesson8_final_static {

    static final double P = 3.14;

    double plojadKruga(int radius){
        return P * radius;
    }

   static double dlinaOkruznosti(int radius){
        System.out.println("i use Static method without creat object");
        return 2 * P * radius;
   }

    void info(int radius){
        System.out.println("Radius " + radius +  " " + "Dlina Okruznosti " + dlinaOkruznosti(radius) +
                " " + "Plojad Kruga " + plojadKruga(radius));

   }

    public static int sumUmnozit(int a, int b, int c){
        int s = a*b*c;
        System.out.println(s);
        return s;

    }

    static void sumDilyty(int a, int b){
        int c = a/b;
        System.out.println(c);
    }
}
