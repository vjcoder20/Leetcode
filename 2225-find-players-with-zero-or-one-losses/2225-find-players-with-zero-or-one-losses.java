class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        List<List<Integer>> li = new ArrayList<>();
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
      
        for(int i=0;i<arr.length;i++){
            int win = arr[i][0];
            int lose = arr[i][1];
            
            map.put(win,map.getOrDefault(win,0));
            map.put(lose,map.getOrDefault(lose,0)+1);
            
        }
        
      List<Integer> win = new ArrayList<>();
      List<Integer> lose = new ArrayList<>();
        
       
        
        for(int key:map.keySet()){
            int freq = map.get(key);
           
            if(freq==0)
              win.add(key); 
            
            
            else if(freq==1)
             lose.add(key);  
            
        }
        
        Collections.sort(win);
        Collections.sort(lose);


          li.add(win);
          li.add(lose);
        
        
        return li;
    }
}