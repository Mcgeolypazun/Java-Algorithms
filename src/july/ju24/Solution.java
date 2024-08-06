package july.ju24;

import java.util.Arrays;

public class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int MOD = 1_000_000_007;

        // DP 테이블 초기화
        int[][] dp = new int[n][m];

        // 물에 잠긴 지역을 0으로 설정
        for (int[] puddle : puddles) {
            int x = puddle[1] - 1;
            int y = puddle[0] - 1;
            dp[x][y] = -1; // 물에 잠긴 지역을 -1로 표시
        }

        // 시작 지점 설정
        dp[0][0] = 1;

        // DP 테이블 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                } else {
                    if (i > 0) dp[i][j] += dp[i - 1][j] % MOD;
                    if (j > 0) dp[i][j] += dp[i][j - 1] % MOD;
                    dp[i][j] %= MOD;
                }
            }
        }

        // 학교 위치의 경로 수 반환
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] puddles = {{2, 2}};
        int m = 4;
        int n = 3;
        System.out.println(solution.solution(m, n, puddles)); // 4
    }
}

