class Solution {
    public String countAndSay(int n) {
    
        String s = "1";
        
        for(int i=1;i<n;i++){
            s = count(s);
        }
        
        return s;
        
    }
  public String count(String str){
      StringBuilder sb = new StringBuilder();
      char prev = str.charAt(0);
      int count = 1;
      
      for(int i=1;i<str.length();i++){
          if(str.charAt(i)==prev){
              count++;
          }
          else{
              sb.append(count);
              sb.append(prev);
              prev = str.charAt(i);
              count = 1;
          }
      }
        sb.append(count);
        sb.append(prev);
      
      return sb.toString();
  }
    
}