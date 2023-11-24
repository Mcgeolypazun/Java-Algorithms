package november24th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution T = new Solution();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

//            for(int i=0;i<b;i++){
//                for(int j=0;j<a;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

           // System.out.println(a + b);
       for(int x: T.solution(a,b)){
           System.out.println(x+" ");
       }
    }


    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(n%i == 0){
                arr1.add(i);
            }
        }
        for(int j=0;j<m;j++){
            if(n%j == 0){
                arr2.add(j);
            }
        }

        return answer;
    }
}
