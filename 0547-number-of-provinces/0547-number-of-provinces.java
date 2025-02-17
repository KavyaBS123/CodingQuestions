class Solution {
    private void dfs(int node, int[][] isConnected, boolean[]visited){
        visited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 &&!visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i, isConnected,visited);
            }
        }
        return count;
    }
}