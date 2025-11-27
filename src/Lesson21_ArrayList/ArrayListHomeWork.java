package Lesson21_ArrayList;
import java.util.ArrayList;

public class ArrayListHomeWork {

    static ArrayList<String> abc(String... a) {

        ArrayList<String> sb = new ArrayList<>();

        for (String s : a){
            sb.add(s);
        }

        for(int i = 0; i < sb.size(); i++){
            for(int j = i+1; j< sb.size(); j++){

                if(sb.get(i).equals(sb.get(j))){
                    sb.remove(j);
                    j--;
                }
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        ArrayList<String> result = abc("fuflo","fuflo","suzana");
        System.out.println(result);
    }
}
