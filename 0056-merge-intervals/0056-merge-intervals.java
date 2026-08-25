import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // 1. Sort intervals by start time using basic array swaps
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }

        // 2. Merge overlapping intervals using simple variables
        List<int[]> resultList = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= end) {
                // Overlap: expand the end boundary if needed
                if (nextEnd > end) {
                    end = nextEnd;
                }
            } else {
                // No overlap: store the completed interval and reset tracker
                resultList.add(new int[]{start, end});
                start = nextStart;
                end = nextEnd;
            }
        }

        // Add the last remaining interval
        resultList.add(new int[]{start, end});

        // 3. Convert List<int[]> to int[][] using a simple loop
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}