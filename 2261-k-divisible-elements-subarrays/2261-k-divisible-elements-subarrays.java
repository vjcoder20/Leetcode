class Solution {
    public int countDistinct(int[] arr, int k, int p) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int count = 0;
            
            StringBuilder sb = new StringBuilder();
            
            for(int j=i;j<arr.length;j++){
                if(arr[j]%p==0)
                    count++;
                
                if(count>k)
                    break;
                
                sb.append(arr[j]+" ");
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}
/*[19, 198, 1987, 1, 198719, 7, 987, 8, 9, 98719, 8719, 98, 87, 719]
*/