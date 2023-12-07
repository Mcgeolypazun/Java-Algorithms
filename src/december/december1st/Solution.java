package december.december1st;

import java.util.Scanner;

public class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;

        for(int i=0;i<len;i++){
            int max = 1;
            for(int j=0;j<sizes[i].length;j++){
                if(max < sizes[i][j]){
                    max = sizes[i][j];
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int sizes[][] = new int[4][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                sizes[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(sizes));
    }
}
