class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map.containsKey(ch1)){
                Character get = map.get(ch1);
                if(get!=ch2){
                    return false;
                }
            }
            
            else{
                if(set.contains(ch2)){
                    return false;
                }
            }
            
            map.put(ch1,ch2);
            set.add(ch2);
        }
       
        return true;
    }
}