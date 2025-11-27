package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_119 {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);

            if (i > 0) {
                List<Integer> previous = result.get(i - 1);

                for (int j = 0; j < previous.size() - 1; j++) {
                    current.add(previous.get(j) + previous.get(j + 1));
                }
                current.add(1);
            }
            result.add(current);
        }
        return result.get(rowIndex);
    }
}
