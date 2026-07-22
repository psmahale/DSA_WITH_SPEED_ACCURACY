class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num2= target-nums[i];
            if(arr.containsKey(num2)){
                int j=arr.get(num2);
                return new int[]{i,j};
            }else{
                arr.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}