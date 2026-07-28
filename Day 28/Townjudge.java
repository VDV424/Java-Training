class Solution{
    public int findJudge(int n, int[][] trust){
        int[] ind=new int[n+1];
        int[] outd=new int [n+1];
        for(int[] a:trust){
            int u=a[0];
            int v=a[1];
            outd[u]++;
            ind[v]++;
        }
        for(int i=1;i<n;i++){
            if(ind[i]==n-1 && outd[i]==0){
                return i;
            }
            return -1;
        }
    }
}