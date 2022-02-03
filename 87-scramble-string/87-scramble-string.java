class Solution {
    public static boolean isScrambleRec(String s1, String s2) {
		
		if(s1.equals(s2)==true){
		    return true;
		}
		
		for(int cp=0;cp<s1.length()-1;cp++){
		    if((isScrambleRec(s1.substring(0,cp+1),s2.substring(0,cp+1)) && isScrambleRec(s1.substring(cp+1),s2.substring(cp+1))) || (isScrambleRec(s1.substring(0,cp+1),s2.substring(s2.length()-1-cp)) && isScrambleRec(s1.substring(cp+1),s2.substring(0,s2.length()-1-cp)))){
		        return true;
		    }
		}
		
		return false;
	}
     public static boolean isScrambleTab(String s1, String s2){
         if (s1.length() != s2.length()) return false;
		int len = s1.length();
		
		boolean [][][] F = new boolean[len][len][len + 1];
		for (int k = 1; k <= len; ++k)
			for (int i = 0; i + k <= len; ++i)
				for (int j = 0; j + k <= len; ++j)
					if (k == 1)
						F[i][j][k] = s1.charAt(i) == s2.charAt(j);
					else for (int q = 1; q < k && !F[i][j][k]; ++q) {
						F[i][j][k] = (F[i][j][q] && F[i + q][j + q][k - q]) || (F[i][j + k - q][q] && F[i + q][j][k - q]);
					}
		return F[0][0][len];
     }
    public boolean isScramble(String s1, String s2) {
        // return isScrambleRec(s1,s2);
        return isScrambleTab(s1,s2);
        
    }
}