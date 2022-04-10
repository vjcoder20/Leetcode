class Solution {
    public int calPoints(String[] str) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        
        for(int i=0;i<str.length;i++){
            String s = str[i];
            if(s.equals("+")){
                int num1 = st.peek();
                st.pop();
                int num2 = st.peek();
                st.push(num1);
                st.push(num1+num2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int num = st.peek();
                st.push(num*2);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        while(st.size()>0){
            ans+=st.pop();
        }
        return ans;
    }
}