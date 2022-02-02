class Solution {
    public List<Integer> findAnagrams(String str, String pattern) {
        
        List<Integer> li = new ArrayList<>();
        int s = str.length();
        int p = pattern.length();
        if(p>s) return li;
        
        
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();
        
        for(int i=0;i<p;i++){
            char ch = str.charAt(i);
            char ph = pattern.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            pmap.put(ph,pmap.getOrDefault(ph,0)+1);
        }
        
        int i = p;

        while(i<s){
            
            if(smap.equals(pmap)){
                li.add(i-p);
            }
            
            char ch = str.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            
            char chr = str.charAt(i-p);
            if(smap.get(chr)==1){
                smap.remove(chr);
            }
            else{
               smap.put(chr,smap.get(chr)-1); 
            }
            
            i++;
        }
        System.out.println(smap);
         if(smap.equals(pmap)){
                li.add(i-p);
            }
        
        
       
        return li;
    }
}