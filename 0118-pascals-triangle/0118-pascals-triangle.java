class Solution {
    public List<List<Integer>> generate(int row) {
        
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<row;i++){
            
            List<Integer> al = new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                
                if(j==0 || j==i)
                    al.add(1);
                
                else{
                    al.add(temp.get(j-1)+temp.get(j));
                }
                
                
                
            }
            temp = al;
            li.add(new ArrayList<>(al));
            
        }
        
        return li;
        
    }
}