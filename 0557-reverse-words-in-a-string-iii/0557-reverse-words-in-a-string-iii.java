class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            StringBuilder str = new StringBuilder(arr[i]);
            sb.append(str.reverse());
            if(i!=arr.length-1)
            sb.append(" ");
        }
        
        return sb.toString();
    }
}