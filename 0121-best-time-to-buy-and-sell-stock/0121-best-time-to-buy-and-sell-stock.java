class Solution {
    public int maxProfit(int[] prices) {
        
        Map<String,Integer> map=new HashMap<>();
        char maximum;
        map.put("maximum",0);
        int profit=0;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            int k=prices[i];
            if(min>k){
                min=k;
                max=min;
            }else{
                max=k;
            }
            profit=max-min;
            if(map.get("maximum")<=profit){
                map.put("maximum",profit);
            }
            
        }
        return map.get("maximum");

    }
}