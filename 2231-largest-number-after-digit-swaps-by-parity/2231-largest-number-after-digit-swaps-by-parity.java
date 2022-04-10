class Solution {
    public int largestInteger(int num) {
        
    PriorityQueue<Integer> even = new PriorityQueue<>((a,b)->b.compareTo(a));
    PriorityQueue<Integer> odd = new PriorityQueue<>((a,b)->b.compareTo(a));
        
    String str = num+"";
    
    for(char ch:str.toCharArray()){
        if((ch-'0')%2==0)
            even.add(ch-'0');
        else
        odd.add(ch-'0');
    }
        
       StringBuilder sb = new StringBuilder();
       
         for(char ch:str.toCharArray()){
        if((ch-'0')%2==0)
          sb.append(even.remove());
        else
        sb.append(odd.remove());
    }
      
       
        return Integer.parseInt(sb.toString());
        
        
    }
}