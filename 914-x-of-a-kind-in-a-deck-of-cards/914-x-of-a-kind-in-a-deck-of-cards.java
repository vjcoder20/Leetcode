class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public boolean hasGroupsSizeX(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int GCD = 0;
        for(int key:map.keySet()){
            GCD = gcd(map.get(key),GCD);
        }
        
        return GCD!=1;
    }
}