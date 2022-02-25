class Solution {
    public String getKey(String str){
        int[] arr = new int[26];
        
        for(char ch:str.toCharArray()){
            arr[ch-'a']++;
        }
        
        
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(arr[i]>0){
               sb.append((char)(i+'a'));
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,ArrayList<String>> map = new HashMap<>();
    
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            
            String key = getKey(str);
           
            ArrayList<String> li = map.getOrDefault(key,new ArrayList<>());
            li.add(str);
            map.put(key,li);
        }
        
        List<List<String>> list = new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
       return list;
    }
}