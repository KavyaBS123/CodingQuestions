class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int m=prerequisites.length;
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);

        }
        int indegree[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer>q=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int topo[] =new int[numCourses];
        int ind=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
           topo[ind++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }
        if(ind==numCourses)
        //Checks whether all elements have been added for topo sort
         return topo; // returns that sort
        int [] arr={}; // if not elements are present then take empty arrya and return that
        return arr;
    }
}