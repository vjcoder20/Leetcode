class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int n = matrix.length;
        
        if(n==0){
            return 0;
        }
        
    int m = matrix[0].length;

        
        int[] heights = new int[m];
        
      
        
        int area = largestRectangleArea(heights);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }
                else{
                    heights[j] = 0;
                }
            }
            area = Math.max(area,largestRectangleArea(heights));
        }
        return area;
        
    }
    
     public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max =0;
        
        st.push(-1);
        
        for(int i=0;i<=heights.length;i++){
            int val = i==heights.length? 0:heights[i];
            
            while(st.peek() >=0 && heights[st.peek()] >= val){
                int h = heights[st.pop()];
                int start = st.peek();
                max = Math.max(max, h*(i-start-1));
            }
            st.push(i);
        }
        
        return max;
    }
}