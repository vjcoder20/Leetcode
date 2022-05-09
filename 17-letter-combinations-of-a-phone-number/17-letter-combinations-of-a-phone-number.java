class Solution {
     String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void kpc(String str,String asf,List<String> li){
         if(str.length()==0){
            li.add(asf);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        String codeforch = arr[ch-'0'];
       for(int i=0;i<codeforch.length();i++){
           char chp = codeforch.charAt(i);
           kpc(ros,asf+chp,li);
       }  
    }
    public List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList<>();
        if(digits.length()==0){
            return li;
        }
        kpc(digits,"",li);
        return li;
    }
}