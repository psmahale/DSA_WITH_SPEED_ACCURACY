class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> fre=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(fre.containsKey(num)){
                fre.put(num,fre.get(num)+1);
            }else{
                fre.put(num,1);
            }
        }
        int max=0;
        int Number=nums[0];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(fre.get(num)>max){
                max=fre.get(num);
                Number=num;
            }
        }
        return Number;
    }
}