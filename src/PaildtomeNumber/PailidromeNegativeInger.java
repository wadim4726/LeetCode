package PaildtomeNumber;
import java.util.ArrayList;
import java.util.List;

public class PailidromeNegativeInger {



        public static List<Integer> intToDigitsWithMinus(int number) {
            List<Integer> digits = new ArrayList<>();

            if (number < 0) {
                digits.add(-1);  // Специальный код для минуса
                number = Math.abs(number);
            }

            // Разложим число на цифры (в правильном порядке)
            List<Integer> temp = new ArrayList<>();
            if (number == 0) {
                temp.add(0);
            } else {
                while (number > 0) {
                    temp.add(0, number % 10);
                    number /= 10;
                }
            }

            digits.addAll(temp);
            return digits;
        }

        public static void main(String[] args) {
            System.out.println(intToDigitsWithMinus(1234));   // [1, 2, 3, 4]
            System.out.println(intToDigitsWithMinus(-5678));  // [-1, 5, 6, 7, 8]
            System.out.println(intToDigitsWithMinus(0));      // [0]
        }


}
