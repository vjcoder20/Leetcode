class Solution {
    public int numberOfBeams(String[] bank) {
      ArrayList<Integer> al = new ArrayList<>();
        for(String x:bank){
            int count=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
               count++;
            }
        }
            if(count>0){
                al.add(count);
            }
        }
       int ans = 0;
        for(int i=0;i<al.size()-1;i++){
            ans+=al.get(i)*al.get(i+1);
        }
        return ans;
    }
}