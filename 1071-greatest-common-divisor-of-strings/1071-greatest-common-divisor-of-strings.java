class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        String loop = "";
        String target = "";
        
        if(str1.length()<=str2.length()){
            loop+=str1;
            target+=str2;
        }
            
            else{
            loop+=str2;
            target+=str1;
            }
        
     
        for(int j=loop.length();j>=1;j--){
            
            if(loop.length()%j==0 && target.length()%j==0){
                
                String temp = loop.substring(0,j);
                
                int n = loop.length()/j;
                int m = target.length()/j;
                
                String tar1 = "";
                String tar2 = "";
                
                while(n-->0){
                    tar1+=temp;
                }
                
                while(m-->0){
                    tar2+=temp;
                }
                
                
                if(tar1.equals(loop) && tar2.equals(target))
                    return temp;
                
            }
            
        }
        
        
        
        return "";
            
    }
}