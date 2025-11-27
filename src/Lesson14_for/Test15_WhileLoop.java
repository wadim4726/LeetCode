package Lesson14_for;

public class Test15_WhileLoop {

    static void method (){

        int chas = 0;


        while(chas < 6){

            int minuta = -1;

            do {
                minuta++;
                int secunda = 0;

                while(secunda < 60){
                    System.out.println(chas + " "+ minuta + " " + secunda);
                    secunda++;
                }

            }
            while(minuta < 60);
            chas++;

        }
    }

    public static void main(String[] args) {
        method();
    }
}


