class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged =new ArrayList<>();

        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for(int[] interval : intervals){
            int currentend = currentInterval[1];
            int nextstart=interval[0];
            int nextend=interval[1];

            if(currentend>=nextstart){
                currentInterval[1]=Math.max(currentend,nextend);
            }else{
                currentInterval=interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}