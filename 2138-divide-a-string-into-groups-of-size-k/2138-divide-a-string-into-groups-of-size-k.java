class Solution {
    public String[] divideString(String s, int k, char fill) {
        int slength = s.length();
        int size = (int)Math.ceil((double) slength/(double)k);
        String[] res = new String[size];
        Arrays.fill(res,"");
        // int j=0;
        int count = 0;
        for(int i=0,j=0;i<s.length();i++){
            if(count<k){
                res[j]+=s.charAt(i);
                count++;
            }
            else{
                count = 1;
                j++;
                 res[j]+=s.charAt(i);
            }
            
        }
        while(res[res.length-1].length()!=k){
            res[res.length-1]+=fill;
        }
        return res;
    }
}