//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int v, int n)
    {
       
       List<List<Integer>> li = new ArrayList<>();
       
       for(int i=0;i<n;i++)
       li.add(new ArrayList<>());
       
       for(int i=0;i<v-1;i++){
           String s1 = dict[i];
           String s2 = dict[i+1];
           
           for(int j=0;j<s1.length();j++){
               char ch = s1.charAt(j);
               char ch2 = s2.charAt(j);
               
               if(ch!=ch2){
                   li.get(ch-'a').add(ch2-'a');
                   break;
               }
           }
           
       }
       

       
       int[] arr = new int[n];
        
        int[] indegree = new int[n];
        
        for(int i=0;i<n;i++){
            for(int elem:li.get(i)){
                indegree[elem]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        
        int i = 0;
        
        while(q.size()>0){
            int rem = q.remove();
            arr[i++] = rem;
            
            for(int elem:li.get(rem)){
                indegree[elem]--;
                if(indegree[elem]==0)
                q.add(elem);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(i=0;i<n;i++){
           sb.append((char)('a'+arr[i]));
        }
        
        
        return sb.toString();
        
    }
}