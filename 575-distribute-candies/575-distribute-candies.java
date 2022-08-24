class Solution {
    public int distributeCandies(int[] n) {
        int possible = n.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int elem:n)
            set.add(elem);
        
       return Math.min(set.size(),possible);
    }
}