class Solution {
    
    static class Pair{
        String s;
        int level;
        
        Pair(String s,int level){
            this.s = s;
            this.level = level;
        }
    }
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        for(String w:wordList)
            set.add(w);
        
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(beginWord,1));
        
        while(q.size()>0){
            Pair rem = q.remove();
            String str = rem.s;
            int lvl = rem.level;
           
            for(int i=0;i<str.length();i++){
                for(int j=0;j<26;j++){
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(i,(char)('a'+j));
                    String st = sb.toString();
                    if(!set2.contains(st) && set.contains(st)){
                        if(st.equals(endWord))
                            return lvl+1;
                        q.add(new Pair(st,lvl+1));
                        set2.add(st);
                    }
                }
            }
            
        }
        
        return 0;
        
    }
}