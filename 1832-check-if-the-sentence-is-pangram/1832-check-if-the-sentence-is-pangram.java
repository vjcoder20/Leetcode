class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        
        for(char ch:s.toCharArray())
            arr[ch-'a']++;
        
        for(int elem:arr)
            if(elem==0)
                return false;
        
        return true;
    }
}