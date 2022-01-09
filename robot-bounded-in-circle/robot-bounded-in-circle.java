class Solution {
    public boolean isRobotBounded(String str) {
        char direction = 'N';
        int x = 0;
        int y = 0;
       for(char ch:str.toCharArray()){
           if(ch=='G'){
               if(direction=='N')
                   y++;
               else if(direction=='S')
                   y--;
               else if(direction=='E')
                   x++;
               else
                   x--;
                  
           }else if(ch=='L'){
               if(direction=='N')
                  direction='W';
               else if(direction=='S')
                 direction='E';
               else if(direction=='E')
                  direction='N';
               else
                   direction='S';
           }else if(ch=='R'){
                if(direction=='N')
                  direction='E';
               else if(direction=='S')
                 direction='W';
               else if(direction=='E')
                  direction='S';
               else
                   direction='N';
           }
       }
        if(x==0 && y==0){
            return true;
        }
        
        if(direction=='N'){
            return false;
        }
        return true;
    }
}