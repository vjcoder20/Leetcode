class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
      for(int i=2;i<arr.length;i++){
          int a = arr[i-2];
          int b = arr[i-1];
          int c = arr[i];
          
          if((a+b)>c)
            max = Math.max(max,a+b+c);
      }
        return max;
    }
}