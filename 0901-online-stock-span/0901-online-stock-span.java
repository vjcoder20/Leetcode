class StockSpanner {

    static class Pair{
        int val;
        int popfreq;
        
        Pair(int val,int popfreq){
            this.val = val;
            this.popfreq = popfreq;
        }
    }
    
     Stack<Pair> st;
    
    
    public StockSpanner() {
       st = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        
        while(st.size()>0 && st.peek().val<=price){
            Pair rp = st.peek();
            count+=rp.popfreq;
            st.pop();
        }
        
        st.push(new Pair(price,count));
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */