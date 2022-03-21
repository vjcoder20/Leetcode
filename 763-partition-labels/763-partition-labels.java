class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> li = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        
        // System.out.println(map);
        
        int prev = -1;
        int max = 0;
        
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           int getidx = map.get(ch);
           max = Math.max(max,getidx);
           if(max==i){
               li.add(max-prev);
               prev = max;
           }
       }
        return li;
    }
}