package Lesson9_VariablesScop;


public class Test1 {

    int a = 10;
    static int b = 2;

      void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test1.b);
      }

    public static void main (String[] args){
        Test1 t = new Test1();
        t.abc(26);
    }

}

