class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long diff = 0;
        long min = diff;
        long max = diff;
        // the possible max and min value when adding differences
        for (int i = 0; i < differences.length; ++i) {
            diff += differences[i];
            min = Math.min(min, diff);
            max = Math.max(max, diff);
        }
        long ub = upper-max,lb = lower-min;
        return (int)((ub-lb+1)>0?(ub-lb+1):0);
    }
}