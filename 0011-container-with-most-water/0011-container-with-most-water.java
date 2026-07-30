class Solution {
    public int maxArea(int[] height) {
        // int left =height[0];;
        // int right=height[height.length-1];
        int max=0;
        int vol=0;
        int length=height.length-1;
        int l=0;
        int r=height.length-1;
        // for(int i=0;i<height.length;i++){
        //     if()
        // }
        while(l<r){
            int left =height[l];;
            int right=height[r];
            if(left<=right){
                max=length*left;
                l++;
                length--;
            }else{
                max=length*right;
                r--;
                length--;
            }
            if(max>=vol){
                vol=max;
            }
        }
        return vol;
    }
}