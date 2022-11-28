class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0;i<2;i++)
            li.add(new ArrayList<>());
        
        
        
     
        TreeMap<Integer,Integer> lose = new TreeMap<>();
        TreeMap<Integer,Integer> win = new TreeMap<>();
        
        
       for(int i=0;i<arr.length;i++){
           int f = arr[i][0];
           int s = arr[i][1];
           
           win.put(f,win.getOrDefault(f,0)+1);
           lose.put(s,lose.getOrDefault(s,0)+1);
       }
        
        for(int key:win.keySet()){
            if(!lose.containsKey(key))
                li.get(0).add(key);
        }
        
        for(int key:lose.keySet()){
            int freq = lose.get(key);
            if(freq==1)
             li.get(1).add(key);   
        }
        
        
        
        return li;
        
        
    }
}