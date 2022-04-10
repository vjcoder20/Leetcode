class Solution {
    public String minimizeResult(String str) {
        
    //Basically Expression boils down to : N1 * (N2+N3) * N4
    //where N1 and N2 are part of num1 && N3 and N4 are part of num2
        
        int small = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        int plus = -1;
        
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='+'){
                plus = i;
                break;
            }
        }
        
        for(int i=0;i<plus;i++){
            for(int j=plus+1;j<str.length();j++){
                
                int n1 = 1;
                String n1str = str.substring(0,i);
                if(n1str.length()>0){
                    n1 = Integer.parseInt(n1str);
                }
                
                String n2str = str.substring(i,plus);
                int n2 = Integer.parseInt(n2str);
                
                String n3str = str.substring(plus+1,j+1);
                int n3 = Integer.parseInt(n3str);
                
                int n4 = 1;
                String n4str = str.substring(j+1);
                if(n4str.length()>0){
                    n4 = Integer.parseInt(n4str);
                }
                
                int val = n1*(n2+n3)*n4;
                if(val<small){
                   small = val;
                    left = i;
                    right = j+1;
                }
            }
        }
        
        String ans = "";
        ans+=str.substring(0,left);
        ans+="(";
        ans+=str.substring(left,right);
        ans+=")";
        ans+=str.substring(right);
        
        return ans;
    }
}