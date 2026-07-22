import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0; 
        int right;
        int max=0;
        int len=0;
        for(right=0;right<s.length();right++){
            char x=s.charAt(right);
            if(!set.contains(x)){
                set.add(x);
                len+=1;
                if(len>max){
                    max=len;
                }
            }else{
                set.remove(s.charAt(left));
                left++;
                right--;
                len-=1;
            }
        }
        return max;
    
    }
}