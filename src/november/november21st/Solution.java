package november.november21st;

import java.util.Scanner;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0;i<a.length;i++){
            answer += a[i]*b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int aa = kb.nextInt();
        int a[] = new int[aa];
        for(int i=0;i<aa;i++){
             a[i] = kb.nextInt();
        }
        int b[] = new int[aa];

        for(int i=0;i<aa;i++){
             b[i] = kb.nextInt();
        }
        System.out.println(T.solution(a,b));
    }
}
