//Code similar to Maximum sum of non-adjacent elements
class Solution {
    public int fun(ArrayList<Integer> nums) {
		int[] dp = new int[nums.size()];
        dp[0] = nums.get(0);
        for(int i=1;i<nums.size();i++){
        int pick = nums.get(i);
            if(i-2>=0){
                pick+=dp[i-2];
            }
        int nonpick = dp[i-1];
            dp[i] = Math.max(pick,nonpick);
        }
   		return dp[dp.length-1];
	}

    public int rob(int[] arr) {
        int n= arr.length;
        if(n==1){
            return arr[0];
        }
     ArrayList<Integer> al1 = new ArrayList<>();
     ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=0){
                al1.add(arr[i]);
            }
            if(i!=n-1){
               al2.add(arr[i]);
            }
        }
        int ans1 = fun(al1); //Here I am not including first element in ArrayList
        int ans2 = fun(al2); //Here I am not including last element in ArrayList
        return Math.max(ans1,ans2);
    }
}