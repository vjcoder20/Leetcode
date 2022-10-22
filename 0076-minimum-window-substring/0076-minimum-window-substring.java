class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char ch:t.toCharArray())
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        
        int mc = 0;
        int dmc = t.length();
        
        int i=-1,j=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        
        String ans = "";
        
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            
            //acquire
            
            while(i<s.length()-1 && mc!=dmc){
                i++;  
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                
                if(map.get(ch)<=map2.getOrDefault(ch,0))
                    mc++;
                
                f1 = true;
            }
            
            //release
            while(j<i && mc==dmc){
                String pans = s.substring(j+1,i+1);
                if(ans.length()==0 || pans.length()<ans.length())
                    ans = pans;
                j++;
                char ch = s.charAt(j);
                if(map.get(ch)==1)
                    map.remove(ch);
                else
                map.put(ch,map.get(ch)-1);
                
                 if(map.getOrDefault(ch,0)<map2.getOrDefault(ch,0))
                    mc--;
                    
                    f2 = true;
            }
            
            if(f1==false && f2==false)
                break;
                
        }
        
        return ans;
        
    }
}