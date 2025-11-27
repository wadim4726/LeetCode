package Lesson14_for;

public class Test14 {

    public static void method(){

        Outer: for(int chas = 0; chas <= 6; chas++){

            Middle : for (int minuta = 1; minuta < 60; minuta++){

                if (chas > 1 ){
                    break Outer;
                }

                Inner: for (int secunda = 0; secunda <=59; secunda++){

                    if (secunda*chas > minuta ){
                        continue Inner;
                    }

                    System.out.println(" Chas" + " "+ chas + " " + "Minuta " + minuta + " Secunda" + " " + secunda );

                }
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
