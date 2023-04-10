//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    static class Pair{
        String s;
        int level;
        
        Pair(String s,int level){
            this.s = s;
            this.level = level;
        }
    }
    public int wordLadderLength(String beginWord, String endWord, String[] wordList)
    {
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