class Solution {
    public boolean containsDuplicate(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int elem:arr){
            if(set.contains(elem)==true)
                return true;
            set.add(elem);
        }
        
        return false;
        
        
    }
}