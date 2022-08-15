class Solution {
    public int romanToInt(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int ans = map.get(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='V' || ch=='X'){
                char ch2 = s.charAt(i-1);
                if(ch2=='I'){
                    ans+=map.get(ch)-2*map.get(ch2);
                }
                else
                ans+=map.get(ch);
            }
            else if(ch=='L' || ch=='C' ){
                 char ch2 = s.charAt(i-1);
                if(ch2=='X'){
                     ans+=map.get(ch)-2*map.get(ch2);
                }
                else
                ans+=map.get(ch); 
            }
            else if(ch=='D' || ch=='M'){
                 char ch2 = s.charAt(i-1);
                if(ch2=='C'){
                    ans+=map.get(ch)-2*map.get(ch2);
                }
                 else
                ans+=map.get(ch);
            }
            else
            ans+=map.get(ch);
        }
        
        return ans;
        
    }
}