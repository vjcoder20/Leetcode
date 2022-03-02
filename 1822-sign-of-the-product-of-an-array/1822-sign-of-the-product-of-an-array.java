class Solution {
    public int arraySign(int[] arr) {
      boolean flag = false;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                flag = true;
                break;
            }
            else if(arr[i]<0){
                count++;
            }
        }
        
        if(flag==true)
            return 0;
        
        if(count%2==0)
            return 1;
        else
            return -1;
    }
}