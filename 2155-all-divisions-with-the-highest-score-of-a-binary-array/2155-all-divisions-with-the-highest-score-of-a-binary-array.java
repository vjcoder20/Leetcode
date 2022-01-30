class Solution {
    public List<Integer> maxScoreIndices(int[] arr) {
        List<Integer> al = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];  //calculate number of ones
        }
        al.add(0);
        int max = count;
        
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]==0) count++;
            if(arr[i-1]==1) count--;
            
            if(count==max){
                al.add(i);
            }
            else if(count>max){
                al.clear(); //al = new ArrayList<>()
                al.add(i);
                max = count;
            }
        }
        return al;
    }
}