class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length())
            return false;
        
        int[] arr1 = new int[100001];
        int[] arr2 = new int[100001];
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:word1.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        
        for(char ch:map.keySet()){
            int get = map.get(ch);
            arr1[get]++;
        }
        
       HashMap<Character,Integer> map2 = new HashMap<>();
        
         for(char ch:word2.toCharArray()){
             if(map.containsKey(ch)==false) return false;
            map2.put(ch,map2.getOrDefault(ch,0)+1);
         }
        
        for(char ch:map2.keySet()){
            int get = map2.get(ch);
            arr2[get]++;
        }
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        
        return true;
        
    }
}