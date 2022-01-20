class Solution {
    public int[] maxSumOfThreeSubarrays(int[] arr, int k) {
        return solution(arr,k);
    }
    
    public int[] solution(int[] arr,int k){
        int n = arr.length;
        
		int[] dp1 = new int[n];
		
		
	
		int[] dp2 = new int[n];
		
		int[] psum = new int[n];
		
		for(int i=0;i<n;i++){
		    if(i==0){
		        psum[i] = arr[i];
		    }else{
		        psum[i] = psum[i-1]+arr[i];
		    }
		}
		
		int temp = 0;
		for(int i=0;i<k;i++){
		    temp+=arr[i];
		}
		
		dp1[k-1] = temp;
		
		for(int i=k;i<n;i++){
		     temp = temp-arr[i-k]+arr[i];
		    dp1[i] = Math.max(dp1[i-1],temp);
		}
		
		temp = 0;
		for(int i=n-1;i>=n-k;i--){
		    temp+=arr[i];
		}
		
		dp2[n-k] = temp;
		
			for(int i=n-k-1;i>=0;i--){
			   temp = temp-arr[i+k]+arr[i];
		    dp2[i] = Math.max(dp2[i+1],temp);
		}
		
		int maxSum = 0;
		int spma = 0;
		int leftsum = 0;
		int rightsum = 0;
		
		//starting index of middle array varies from k to n-2*k
		for(int i=k;i<=n-2*k;i++){
		    if(dp1[i-1]+dp2[i+k]+psum[i+k-1]-psum[i-1]>maxSum){
		  leftsum = dp1[i-1];
		  rightsum = dp2[i+k];
		    maxSum =dp1[i-1]+dp2[i+k]+psum[i+k-1]-psum[i-1];
		    spma = i;
		}
		}
		
		
		
        int li = 0;
	for(int i=k-1;i<n;i++){
	    if(dp1[i]==leftsum){
	       li = i-k+1;
	        break;
	    }
	}
        
       
	
	
        
        int ri = 0;
		
	for(int i=spma+k;i<n;i++){
	    if((psum[i+k-1]-psum[i-1])==rightsum){
	       ri = i;
	        break;
	    }
	}
		
       return new int[]{li,spma,ri};
		
		
		
		
        

		
	}
    
}