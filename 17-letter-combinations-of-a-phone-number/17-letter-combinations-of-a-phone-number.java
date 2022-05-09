class Solution {
     String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     public ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        
        String codeforch = arr[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(int j =0;j<rres.size();j++){
                mres.add(chcode + rres.get(j));
            }
        }
        return mres;
    }
    public List<String> letterCombinations(String digits) {
       
        if(digits.length()==0){
            return new ArrayList<>();
        }
        return getKPC(digits);
    }
}