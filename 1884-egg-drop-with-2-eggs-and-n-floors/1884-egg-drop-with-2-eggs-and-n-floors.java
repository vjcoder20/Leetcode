class Solution {
    public int twoEggDrop(int n) {
        
        int f1 = (int)Math.ceil(Math.pow(1+8*n,0.5)-1);
        int f2 = (int)Math.ceil(((double) f1/(double) 2));
        return f2;
    }
}