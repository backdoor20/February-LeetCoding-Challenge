class Solution {
    public boolean isBipartite(int[][] graph) {
        int len=graph.length;
        int[] color=new int[len];
        Arrays.fill(color,-1);
        for(int i=0;i<len;i++){
            if(color[i]==-1){
                color[i]=1;
                if(!dfs(i,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean dfs(int currentIndex,int[][] graph,int[] color){
        int currentColor=color[currentIndex];
        for(int connectedIndex : graph[currentIndex]){
            if(color[connectedIndex]==currentColor){
                return false;
            }
            if(color[connectedIndex]==-1){
                color[connectedIndex]=1-currentColor;
                if(!dfs(connectedIndex,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
}