class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String str = arr[i];
            
            if(map.containsKey(ch)){
                String get = map.get(ch);
                if(!get.equals(str)){
                    return false;
                }
            }
            
            else{
                if(set.contains(str)){
                    return false;
                }
            }
            
            map.put(ch,str);
            set.add(str);
        }
       
        return true;
    }
}