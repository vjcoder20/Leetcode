//--Smart Method
class Solution {
   public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (words.length != pattern.length())
        return false;
    Map index = new HashMap();
    for (Integer i=0; i<words.length; ++i)
        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
            return false;
    return true;
}
}
/* -->Easy Method
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
         Map<String, Boolean> map2 = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)==false){
                if(map2.containsKey(words[i])==true){
                    return false;
                }
                else{
                  map.put(ch,words[i]);
                    map2.put(words[i],true);
                }
                
            }
               else{
                  String mapword = map.get(ch);
                  if(mapword.equals(words[i])==false){
                      return false;
                  }
               }
        }
        return true;
    }
}
*/