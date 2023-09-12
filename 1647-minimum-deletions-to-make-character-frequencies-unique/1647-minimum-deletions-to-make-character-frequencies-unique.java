class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
       
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        // System.out.println(map);
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:map.values()){
            if(set.contains(i)==true){
                while(set.contains(i) && i>0){
                    i--;
                    ans++;
                }
            }
             set.add(i);
           
        }
        
        return ans;
        
    }
}