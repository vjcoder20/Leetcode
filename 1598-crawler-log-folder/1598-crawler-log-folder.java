class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack();
        
        for(int i=0;i<logs.length;i++){
            if(st.size()>0 && logs[i].equals("../")){
                st.pop();
            }
            else if(logs[i].equals("./")){
               continue;
            }
            else if(!logs[i].equals("../")){
            st.push(logs[i]);
            }
        }
        
        System.out.println(st);
        int count = 0;
        while(st.size()>0){
            st.pop();
            count++;
        }
        return count;
    }
}