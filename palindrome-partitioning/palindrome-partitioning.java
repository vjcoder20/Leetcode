class Solution {
    List<List<String>> ans = new ArrayList<>();
      public boolean isPallindrome(String str){
        int i=0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        getPallindrome(s, new ArrayList<>());
        return ans;
    }
    
    public void getPallindrome(String str, List<String> asf)
    {
        if(str.length() == 0){
           ans.add(new ArrayList<>(asf));
            return;
        }
        for(int i = 0; i<str.length(); i++){
            String ss = str.substring(0, i+1);
            String ros = str.substring(i+1);
            if(isPallindrome(ss)){
                asf.add(ss);
                getPallindrome(ros, asf);
                asf.remove(asf.size() - 1);
            }
        }        
    }
}
