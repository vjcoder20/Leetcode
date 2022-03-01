class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
      for(int i=arr.length-1;i>1;i--){
          int a = arr[i-2];
          int b = arr[i-1];
          int c = arr[i];
          
          if((a+b)>c)
            return a+b+c;
      }
        return max;
    }
}