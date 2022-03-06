class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
          //We will not do this question with pure acquire and release strategy body because we now the window size this time so we will apply common sense i.e. window size would be pattern.size   
        
        List<Integer> li = new ArrayList<>();
        int sz = p.length();
        int szs = s.length();
        if(szs<sz)
            return li;
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();
        
        for(char ch:p.toCharArray())
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        
        int i = 0;
        int j = 0;
        
        while(i<sz){
            char ch = s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            i++;
        }
        
        
        
        while(i<s.length()){
               if(smap.equals(pmap))
                    li.add(j);
            
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            
            //acquire
              smap.put(chi,smap.getOrDefault(chi,0)+1);
            
            //release
            int freq = smap.get(chj);
            if(freq==1)
            smap.remove(chj);
            
            else
             smap.put(chj,smap.get(chj)-1);
            
            i++;
            j++;
        }
       
         if(smap.equals(pmap))
                    li.add(j);
        
       
        return li;
    }
}