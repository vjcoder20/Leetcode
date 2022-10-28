class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li = new ArrayList<>();
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            str = String.valueOf(arr);
            if(map.containsKey(str)){
                List<String> al = map.get(str);
                al.add(strs[i]);
                map.put(str,al);
            }
            else{
                 List<String> al = new ArrayList<>();
                 al.add(strs[i]);
                 map.put(str,al);
            }
            
        }
        
        for(String key:map.keySet()){
            List<String> al = map.get(key);
            li.add(new ArrayList<>(al));
        }
        return li;
    }
}