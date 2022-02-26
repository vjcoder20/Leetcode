class Solution {
    /*
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
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        /* Smart Way
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
       */
        //Naive Approach  
    HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();
    for(int i=0;i<strs.length;i++){
        HashMap<Character,Integer> fmap = new HashMap<>();
        String str = strs[i];
        for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }
        
        ArrayList<String> list = map.getOrDefault(fmap,new ArrayList<>());
        list.add(str);
        map.put(fmap,list);
    }
   
   List<List<String>> list = new ArrayList<>();
    for(HashMap<Character,Integer> key:map.keySet()){
        list.add(map.get(key));
    }
        return list;
    }
}