class ListNode {
    int x, y, z;

    ListNode(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Solution {

    public int[][] updateMatrix(int[][] mat) {
       int n =mat.length;
       int m=mat[0].length;
       int vis[][]=new int [n][m];
       int dist[][]=new int[n][m];
       Queue <ListNode> q=new LinkedList<ListNode> ();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){
                q.add(new ListNode(i,j,0));
                vis[i][j]=1;
            }
            else{
                vis[i][j]=0;
            }
        }
       }
       int delrow[]={-1,0,+1,0};
       int delcol[]={0,+1,0,-1};
       while(!q.isEmpty()){
        int row=q.peek().x;
        int col=q.peek().y;
        int steps=q.peek().z;
        q.remove();
        dist[row][col]=steps;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m
            && vis[nrow][ncol]==0){

            
            vis[nrow][ncol]=1;
            q.add(new ListNode(nrow,ncol,steps+1));
        
            }
       }
    }
    return dist;
}
}