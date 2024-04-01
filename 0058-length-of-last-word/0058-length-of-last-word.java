class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        // System.out.println(Arrays.toString(str));
        return str[str.length-1].length();
    }
}