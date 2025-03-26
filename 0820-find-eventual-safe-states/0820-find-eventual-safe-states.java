// class Solution {
//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         int n=graph.length;
//         ArrayList<ArrayList<Integer>> adjRev=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             adjRev.add(new ArrayList<>());
//         }
//         int indegree[]=new int[n];
//         for(int i=0;i<n;i++){
//             for(int j=0; j < graph[i].length;j++){

//              adjRev.get(graph[i][j]).add(i);
//                 indegree[i]++;
//             }
//         }
//         Queue<Integer>q=new LinkedList<>();
       
//         for(int i=0;i<n;i++){
//             if(indegree[i]==0){
//                 q.add(i);
//             }
//         }
//          List<Integer>safeNodes=new ArrayList<>();
//         while(!q.isEmpty()){
//             int node=q.peek();
           
//             safeNodes.add(node);
//             for(int it:adjRev.get(node)){
               
//                 if(--indegree[it]==0){
//                 q.add(it);
//             }
//         }
//     }
//         Collections.sort(safeNodes);
//         return safeNodes;
//     }
// }
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Graph.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                Graph.get(graph[i][j]).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);

            for (int neigh:Graph.get(curr)) {
                if (--indegree[neigh] == 0) {
                    q.add(neigh);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}