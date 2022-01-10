class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int ans = 0;
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
            
            int num1 = 0;
            int num2 = 0;
            if(i>=0){
               num1 = a.charAt(i)-'0'; 
            }
            if(j>=0){
                num2 = b.charAt(j)-'0';
            }
            
            ans = num1+num2+carry;
            if(ans==2){
                carry = 1;
                sb.append(0);
            }
            else if(ans>2){
                carry = 1;
                sb.append(1);
            }
            else{
                carry = 0;
                sb.append(ans);
            }
            i--;
            j--;
        }
       sb = sb.reverse();
    return sb.toString();
        }  
    }
