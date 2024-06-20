package may.m3;

import java.util.*;

public class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] dp = new Set[9];

        // 초기화
        for (int i = 1; i <= 8; i++) {
            dp[i] = new HashSet<>();
            dp[i].add(Integer.parseInt(Integer.toString(N).repeat(i)));
        }

        // 1개에서 8개의 숫자로 만들 수 있는 경우 계산
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                for (int num1 : dp[j]) {
                    for (int num2 : dp[i - j]) {
                        dp[i].add(num1 + num2);
                        dp[i].add(num1 - num2);
                        dp[i].add(num1 * num2);
                        if (num2 != 0) {
                            dp[i].add(num1 / num2);
                        }
                    }
                }
            }

            // 결과가 number와 같으면 현재 사용된 숫자의 개수 리턴
            if (dp[i].contains(number)) {
                return i;
            }
        }

        return -1; // 최솟값이 8보다 큰 경우
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int number = kb.nextInt();
        System.out.println(T.solution(N, number));
    }
}
