// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String str1, String str2, int k) {
         if(str1.length()!=str2.length()){
 	         return false;
 	     }
 	     
 	     int ans = 0;
 	     HashMap<Character,Integer> map = new HashMap<>();
 	     
 	     for(char ch:str1.toCharArray()){
 	         map.put(ch,map.getOrDefault(ch,0)+1);
 	     }
 	     
 	     for(char ch:str2.toCharArray()){
 	         if(map.containsKey(ch))
 	         map.put(ch,map.get(ch)-1);
 	     }
 	     
 	     
 	     for(char ch:map.keySet()){
 	         int val = map.get(ch);
 	         if(val>0)
 	         ans+=val;
 	     }
 	     
 	     return ans<=k;
    }
}