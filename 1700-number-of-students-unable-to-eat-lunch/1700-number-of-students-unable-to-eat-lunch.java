class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0;
        int square = 0;
        
        for(int i=0;i<students.length;i++){
            int val = students[i];
            if(val==0)
                circle++;
            else
                square++;
        }
        
         for(int i=0;i<sandwiches.length;i++){
             int val = sandwiches[i];
             
             if(val==0 && circle==0)
                 return square;
             
             else if(val==1 && square==0)
                 return circle;
             
             if(val==0)
                 circle--;
             else
                 square--;
             
         }
        
        return 0;
        
        
    }
}