import java.util.HashMap;
import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1){
            return 0;
        }
        Map<Character,Integer> once=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(once.containsKey(ch)){
                once.put(ch,once.get(ch)+1);
            }else{
                once.put(ch,1);
            }
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(once.get(ch)==1){
                return i;
            }
        }

        return -1;
    }
}