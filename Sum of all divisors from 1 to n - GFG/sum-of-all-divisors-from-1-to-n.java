//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        long ans = 0;
        
        for(int i=1;i<=N;i++){
            ans+=(N/i)*i;
        }
        
        return ans;
        
        
        //4+4+3+4
        //5+4+3+4+5
        //6+6+6+4+5+6
        //7+6+6+4+5+6+7
    }
}