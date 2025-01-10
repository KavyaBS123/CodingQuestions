class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int [] height=new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                } else{
                    height[j]=0;
                }
            }
            maxArea=Math.max(maxArea,largestrectanglearea(height));
        }

        return maxArea;
    }
    private int largestrectanglearea(int[] heights){

    
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && (i==n || heights[stack.peek()]>=heights[i])){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()? i:i-stack.peek()-1;
                maxArea=Math.max(maxArea,width*height);
            }
            stack.push(i);
        }
        return maxArea;
    }
}