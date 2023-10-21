import java.util.*;

public class TwoThreeOneSix_solution {
    public long countPairs(int n, int[][] edges) {
        UnionFind unionFind = new UnionFind(n);
        for(int[] edge:edges){
            unionFind.join(edge[0],edge[1]);
        }

       long res=0;
        for(int i=0;i<n;++i){
            if(unionFind.find(i)==i){
                long size=unionFind.getSize(i);
                res+=size*(n-size);
            }
        }

        return res/2;
    }


    class UnionFind{
        int[] pres;
        int[] sizes;


        public UnionFind(int capacity){
            pres=new int[capacity];
            sizes=new int[capacity];
            for(int i=0;i<capacity;++i){
                pres[i]=i;
                sizes[i]=1;
            }
        }

        public int find(int x){
            if(pres[x]==x){
                return x;
            }
            sizes[pres[x]]+=sizes[x];
            pres[x]=find(pres[x]);

            return pres[x];
        }

        public void join(int x,int y) {
            int fx = find(x);
            int fy = find(y);
            if (fx != fy) {

                pres[fx] = fy;
                sizes[fy] += sizes[fx];
                sizes[fx] = 0;


            }
        }

        public int getSize(int i){
            return sizes[i];
        }

    }


}
