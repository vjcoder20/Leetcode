class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String temp = "";
            for(char ch:str.toCharArray()){
                temp+=arr[ch-'a'];
            }
            set.add(temp);
        }
        
        
        return set.size();
    }
}