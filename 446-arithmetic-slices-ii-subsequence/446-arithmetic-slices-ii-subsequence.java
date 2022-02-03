class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
     int res = 0;
    HashMap<Integer, Integer>[] map = new HashMap[arr.length];
    
    for(int i=0;i<arr.length;i++){
        map[i] = new HashMap<>();
        
        for (int j = 0; j < i; j++) {
             long diff = (long)arr[i] - arr[j];
            if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
            int d = (int)diff;
        		
            int c1 = map[i].getOrDefault(d, 0);
            int c2 = map[j].getOrDefault(d, 0);
            res += c2;
            map[i].put(d, c1 +c2 + 1);
        
    }
		
	}
	return res;
    }
}