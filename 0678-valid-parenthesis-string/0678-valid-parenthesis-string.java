class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> brac = new Stack<>();
        Stack<Integer> mul = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(ch=='(')
                brac.push(i);
                

            else if(ch == '*')
                mul.push(i);
            
            else{
                
                if(brac.size()>0)
                brac.pop();
                
                else if(mul.size()>0)
                mul.pop();
                
                else
                return false;
                
            }
               
          
        }
        
        
         while (!brac.isEmpty() && !mul.isEmpty()) {
           
            if (brac.pop() > mul.pop()) {
                return false; 
            }
        }
        
     
        return brac.size()==0;
    }
}