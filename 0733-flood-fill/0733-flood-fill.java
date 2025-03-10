class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
  
int inicolor=image[sr][sc];
int[][]ans=image;
int delrow[]={-1,0,+1,0};
int delcol[]={0,+1,0,-1};
dfs(image,ans,sr,sc,inicolor,color,delrow,delcol);
return ans;
    }



  private void dfs(int [][] image,int ans[][], int sr, int sc , int inicolor, int color,int delrow[],int delcol[]){
    ans[sr][sc]=color;
    int n=image.length;
    int m=image[0].length;
    for(int i=0;i<4;i++){
        int nrow=sr+delrow[i];
        int ncol=sc+delcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
        image[nrow][ncol]==inicolor && ans[nrow][ncol]!=color){
            dfs(image,ans,nrow,ncol,inicolor,color,delrow,delcol);
        }
        
    }
  }
 }