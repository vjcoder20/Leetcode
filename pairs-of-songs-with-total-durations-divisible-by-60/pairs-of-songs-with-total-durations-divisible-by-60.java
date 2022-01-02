class Solution {
    public int numPairsDivisibleBy60(int[] arr) {
      int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i]%60;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<temp.length;i++){
            map.put(temp[i],map.getOrDefault(temp[i],0)+1);
        }
        int count = 0;
        for(int i:map.keySet()){
            if(i==0 || i==30){
                count+=((map.get(i)-1)*map.get(i))/2;
            }
            else if((i<30) && (map.containsKey(60-i))){
                count+=map.get(i)*map.get(60-i);
            }
        }
        return count;
    }
}