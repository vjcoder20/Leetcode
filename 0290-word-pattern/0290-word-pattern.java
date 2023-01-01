class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] arr = s.split(" ");
        
        if(arr.length!=pattern.length())
            return false;
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                String get = map.get(ch);
                if(!get.equals(arr[i]))
                    return false;
            }
            else{
               if(set.contains(arr[i]))
                   return false;
            }
            
            map.put(ch,arr[i]);
            set.add(arr[i]);
        }
        
        return true;
    }
}