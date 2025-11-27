package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeSum_1508_med {

    public int rangeSum(int[] nums, int n, int left, int right) {

        List<Integer> sums = new ArrayList<>();

        for (int start = 0; start < nums.length ; start++) {
            int currentSum = 0;
            for (int end = start; end < nums.length ; end++) {
                currentSum += nums[end];
                sums.add(currentSum);
            }
        }
        List<Integer> sortedSums = sums.stream().sorted().collect(Collectors.toList());

        int result = IntStream.range(0, sortedSums.size())
                .filter(i -> i>=left - 1 && i<=right - 1)
                .map(i -> sortedSums.get(i)).sum();
        return result;
        }
    }




































