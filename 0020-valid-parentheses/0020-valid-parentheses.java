class Solution {
    public boolean isValid(String s) {
       char[] arr=s.toCharArray();
       if(arr.length%2!=0){
        return false;
       }
       Map<Character,Character> map=new HashMap<>();
       map.put(')','(');
       map.put(']','[');
       map.put('}','{');
        Stack<Character> stack=new Stack<>();
         for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!=map.get(ch)){
                    return false;
                }
            }else{
                stack.push(ch);
            }
         }
         return stack.isEmpty();
    }
}