package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    public static void main(String[] args) {

        System.out.println("Hello word");
        System.out.println(generate(13));



    }

    public static List<List<Integer>> generate(int numRows){

        if (numRows <= 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        // add level 0
        List<Integer> level0 = new ArrayList<>();
        level0.add(1);
        result.add(level0);
        // add level 1
        List<Integer> level1 = new ArrayList<>();
        level1.add(1);
        level1.add(1);
        result.add(level1);

        for (int i = 2; i < numRows; i++){
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(1);

            List<Integer> previousLevel = result.get(i - 1);
            for (int j = 0; j <= previousLevel.size() - 2; j++){
                currentLevel.add(previousLevel.get(j) + previousLevel.get(j + 1));
            }
            currentLevel.add(1);
            result.add(currentLevel);
        }
        return result;

    }








}
