class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        if(len==1 && nums[0]==target){
            return 0;
        }
        Map<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(!seen.containsKey(key)){
                seen.put(key,i);  
            }
        }
            if(seen.containsKey(target)){
                return seen.get(target);
            }else{
                return -1;
            }
        
        
    }
}