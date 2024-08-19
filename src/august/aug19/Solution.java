package august.aug19;

import java.util.Arrays;

public class Solution {//DP 배열 값은 최소 횟수를 저장함
    public int solution(int x, int y, int n) {
        // 큰 값을 초기화로 사용
        int[] dp = new int[y + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[x] = 0; // 시작점은 0번 연산

        // DP 상향식 접근
        for (int i = x; i <= y; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue; // 도달할 수 없는 경우

            // i에 n을 더한 값
            if (i + n <= y) {
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
            }

            // i에 2를 곱한 값
            if (i * 2 <= y) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }

            // i에 3을 곱한 값
            if (i * 3 <= y) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }

        // dp[y] 값이 초기값 그대로라면 -1 반환
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(10, 40, 5));
    }
}

