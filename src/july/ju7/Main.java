package july.ju7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vex;
    int cost;

    Edge(int vex,int cost){
        this.vex = vex;
        this.cost = cost;
    }


    @Override
    public int compareTo(Edge ob){
        return this.vex - ob.vex;
    }
}
public class Main {
    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public void solution(int v){
        PriorityQueue<Edge> q = new PriorityQueue<>();

        q.offer(new Edge(v,0));
        dis[v] = 0;
        while(!q.isEmpty()){
            Edge tmp = q.poll();

            int curCost = tmp.cost;
            int curVex = tmp.vex;

            if(dis[curVex] < curCost) continue;

            for(Edge ob : graph.get(curVex)){
                if(dis[ob.vex] > curCost+ob.cost){
                    dis[ob.vex] = curCost+ob.cost;
                    q.offer(new Edge(ob.vex,dis[ob.vex]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i=0;i<m;i++){

            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            graph.get(a).add(new Edge(b, c));

        }

        T.solution(1);
        for(int i=2;i<=n;i++){
            if (dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            }
            else{
                System.out.println(i +" : "+dis[i]);
            }
        }
    }

}

/*
input
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5

answer
2 : 11
3 : 4
4 : 9
5 : 14
6 : impossible
 */