package august.aug14;

import java.util.*;
class Solution {
    public static Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    static int count = 0;
    void DFS(int cnt,int one,int two,boolean flag) {
        count += 1;
        for(int i=0;i<map.get(one).size();i++) {
            if (map.get(one).get(i) == two && flag) {
                flag = false;
                continue;
            }
            DFS(cnt + 1, map.get(one).get(i), one, true);
        }
    }

    public int solution(int n, int[][] wires) {
        int answer = 101;

        for(int wire[] : wires) {
            int a = wire[0];
            int b = wire[1];
            if(!map.containsKey(a)) {
                map.put(a,new ArrayList<>());
            }
            if(!map.containsKey(b)) {
                map.put(b,new ArrayList<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for(int wire[] : wires) {
            DFS(1, wire[0],wire[1],true);
            int wireOne = count;
            count = 0;
            DFS(1, wire[1],wire[0],true);
            int wireTwo = count;
            count = 0;
            answer = Math.min(answer, Math.abs(wireOne - wireTwo));

        }


        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 9;
        int[][] wires = new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        System.out.println(T.solution(n,wires));
    }
}