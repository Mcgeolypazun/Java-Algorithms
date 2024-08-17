package august.aug17;

import java.util.Arrays;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            long num = numbers[i];

            // 다음 가장 작은 비트가 1이나 2개 다른 숫자를 찾는다.
            if ((num & 1) == 0) {
                // num이 짝수라면
                answer[i] = num + 1;
            } else {
                // num이 홀수라면
                long bit = 1;
                while ((num & bit) != 0) {
                    bit <<= 1;
                }
                answer[i] = (num | bit) & ~(bit >> 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new long[]{2, 7})));
    }
}
