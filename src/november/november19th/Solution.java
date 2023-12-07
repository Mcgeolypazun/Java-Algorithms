package november.november19th;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 1+2+3+4+5+6+7+8+9;

        answer = Arrays.stream(numbers).reduce(0, Integer::sum);

        answer = sum - answer;

        return answer;
    }

    public static void main(String[] args) {
        Solution S = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = kb.nextInt();
        }

        System.out.println(S.solution(numbers));
    }
}
