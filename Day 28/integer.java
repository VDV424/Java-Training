import java.util.ArrayList;
import java.util.LinkedList;

class Solution{
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>>adj){
        int size=adj.size();
        boolean[] vis=new boolean[size];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            list.add(node);
            for(int a:adj.get(node)){
                if(!vis[a]){
                    q.offer(a);
                    vis[a]=true;
                }
            }
        }
        return list;
    }
}