class Solution {
    public int twoEggDrop(int n) {
        
        return (int)Math.ceil((-1+Math.sqrt(1+8*n*1.0))/2);
    }
}