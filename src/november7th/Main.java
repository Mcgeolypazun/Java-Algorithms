package november7th;

import java.util.ArrayList;
import java.util.Scanner;

//경로탐색(인접리스트) ArrayList사용
public class Main {
    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){//v는 노드 정점
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0;i<m;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b); //노드는 a get으로 불러오고 b는 연결선 add로 추가한다.
        }
        // 1 - 2 , 3 , 4
        // 2 - 3 , 1 , 4...
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
