class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result=false;
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> ana=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ana.containsKey(ch)){
                ana.put(ch,ana.get(ch)+1);
            }else{
                ana.put(ch,1);
            }
        }
        Map<Character,Integer> mna=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(mna.containsKey(ch)){
                mna.put(ch,mna.get(ch)+1);
            }else{
                mna.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ana.containsKey(ch) && ana.get(ch).equals(mna.get(ch))){
                result=true;
            }else{
                return false;
            }
        }
        return result;

    }
}