class Solution {
    static class Pair{
            int id;
            int st;   //starting time
            int wt;   //waiting time
            
            Pair(int id,int st,int wt){
                this.id = id;
                this.st = st;
                this.wt = wt;
            }
            
        }
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] arr = new int[n];
        Stack<Pair> st = new Stack<>();
        for(String s:logs){
           String[] temp = s.split(":");
            int id = Integer.parseInt(temp[0]);
            String action = temp[1];
            int t = Integer.parseInt(temp[2]);
            
            if(action.equals("start")){
                st.push(new Pair(id,t,0));
            }
            else{
                int tts = t-st.peek().st+1; //total time spent
                int exectime = tts-st.peek().wt;  //basically execution time wo time hoga jab wo stack ke peek par raha ho
                arr[id]+=exectime;
                st.pop();
                
                if(st.size()>0){
                    st.peek().wt+=tts;
                }
            }
        }
        return arr;
    }
}