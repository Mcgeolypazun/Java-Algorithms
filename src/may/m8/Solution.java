package may.m8;

import java.util.*;
class Solution {

    static int max = Integer.MAX_VALUE;
    Set<Integer> set = new HashSet<>();
    static int size;
    void wanjeontamsaek(int[][] triangle,int cnt,int sum,int i,int j){
        if(cnt == size){
            set.add(sum);
            if(max < sum){
                max = sum;
            }
        }
        sum += triangle[i][j];

        if(set.contains(sum)){
            return ;
        }

        wanjeontamsaek(triangle,cnt+1,sum,i+1,j);
        wanjeontamsaek(triangle,cnt+1,sum,i+1,j+1);

    }

    public int solution(int[][] triangle) {
        int answer = 0;
        int cnt = 1;
        int sum = 0;
        int i = 0;
        int j = 0;
        size = triangle.length;
        wanjeontamsaek(triangle,cnt,sum,i,j);

        answer = max;
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 5; // 행의 개수
        int[][] triangle = {
            {7},
            {3, 8},
            {8, 1, 0},
            {2, 7, 4, 4},
            {4, 5, 2, 6, 5}
        };

        System.out.println("T.solution(triangle) = " + T.solution(triangle));
    }
}
