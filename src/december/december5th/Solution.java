package december.december5th;

import java.util.Scanner;

public class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;
        int max = 1;
        int length = 0;
        int width = 0;
        int pair = 0;

        for(int i=0;i<len;i++){//가로 세로 중 최대값 구하기
            for(int j=0;j<sizes[i].length;j++){
                if(max < sizes[i][j]){
                    max = sizes[i][j];
                    length = i;
                    width = j;
                }
            }
        }
        int secMax = 0;
        if(width == 0){

            pair = sizes[length][width+1];
            for(int i=0;i< sizes.length;i++){
                if(sizes[i][width] > pair&& sizes[i][width+1] > pair){
                    pair = Math.min(sizes[i][width],sizes[i][width+1]);
                }
            }

        }
        else if(width == 1){
            pair = sizes[length][width-1];
            for(int i=0;i< sizes.length;i++){
                if(sizes[i][width-1] > pair&& sizes[i][width] > pair){
                    pair = Math.min(sizes[i][width-1],sizes[i][width]);
                }
            }

        }
        answer = max * pair;

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int sizes[][] = new int[5][2];
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                sizes[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(sizes));
    }
}
//[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
//[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]->19 7

//public int solution(int[][] sizes) {
//        int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        return answer;
//    }