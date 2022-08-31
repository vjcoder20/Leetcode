class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
       int n = arr.length;
        
       List<Integer> ans = new ArrayList<>();
        
        int elem1 = -1;
        int elem2 = -1;
        
        int c1 = 0;
        int c2 = 0;
        
        for(int elem:arr){
            if(elem==elem1)  c1++;
            
            else if(elem==elem2) c2++;
            
            else if(c1==0){
              elem1 = elem;
                c1 = 1;
            }
            
            else if(c2==0){
                elem2 = elem;
                c2 = 1;
            }
            
            else{
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        
        for(int elem:arr){
              if(elem==elem1)  c1++;
              else if(elem==elem2) c2++;
        }
        
        if(c1>n/3) ans.add(elem1);
        if(c2>n/3) ans.add(elem2);
        
        return ans;
    }
}