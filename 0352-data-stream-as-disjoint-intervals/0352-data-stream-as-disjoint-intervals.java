class SummaryRanges {

    List<Integer> li;
        
    public SummaryRanges() {
       
       li = new ArrayList<>();
       
        
    }
    
    
    public void addNum(int value) {
        
        if(li.contains(value)==false)
        li.add(value);
        
        
    }
    
    public int[][] getIntervals() {
        
    List<List<Integer>> list = new ArrayList<>();
        
    Collections.sort(li);

        
    for(int i=0;i<li.size();i++){
        
        int start = li.get(i);
        
        while(i+1<li.size() && li.get(i+1)-li.get(i)==1)
            i++;
        
      
        int end = li.get(i);
        List<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        
        
        list.add(new ArrayList<>(temp));
        
    }
        
   
        
         int[][] arr = list.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        
        return arr;
        
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */




/*

["SummaryRanges","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals"]
[[],[6],[],[6],[],[0],[],[4],[],[8],[],[7],[],[6],[],[4],[],[7],[],[5],[]]

[null,null,[[6,6]],null,[[6,6],[6,6]],null,[[0,0],[6,6],[6,6]],null,[[0,0],[4,4],[6,6],[6,6]],null,[[0,0],[4,4],[6,6],[6,6],[8,8]],null,[[0,0],[4,4],[6,6],[6,8]],null,[[0,0],[4,4],[6,6],[6,6],[6,8]],null,[[0,0],[4,4],[4,4],[6,6],[6,6],[6,8]],null,[[0,0],[4,4],[4,4],[6,6],[6,6],[6,7],[7,8]],null,[[0,0],[4,4],[4,6],[6,6],[6,7],[7,8]]]

[null,null,[[6,6]],null,[[6,6]],null,[[0,0],[6,6]],null,[[0,0],[4,4],[6,6]],null,[[0,0],[4,4],[6,6],[8,8]],null,[[0,0],[4,4],[6,8]],null,[[0,0],[4,4],[6,8]],null,[[0,0],[4,4],[6,8]],null,[[0,0],[4,4],[6,8]],null,[[0,0],[4,8]]]


*/