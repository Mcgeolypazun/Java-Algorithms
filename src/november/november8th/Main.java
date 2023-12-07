package november.november8th;
import java.util.*;
public class Main {
    static int n,m,answer;
    static Map<Integer,Integer> map = new HashMap<>();
    static int ch[];
    static int arr[][];
    void DFS(){

    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();//정점의 수
        m = kb.nextInt();//간선의 수
        arr = new int[m][2];

        for (int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        for(int i=2;i<=n;i++){
            map.put(i,0);
        }
        T.DFS();

        for (int x: map.keySet()){
            System.out.println(x +":"+ map.get(x));
        }
    }
}
