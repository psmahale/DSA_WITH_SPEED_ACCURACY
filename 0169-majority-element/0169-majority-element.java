class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        if(nums.length==1){
            return nums[0];
        }
        int freq=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],freq+1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);   
            }
        }
        int f=0;
        int maxf=nums[0];
        for(int i=0;i<nums.length;i++){
           
            if(map.get(nums[i])>f){
                f=map.get(nums[i]);
                maxf=nums[i];
            }
        }
        return maxf;
    }
}