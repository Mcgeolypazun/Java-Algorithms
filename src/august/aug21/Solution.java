package august.aug21;

import java.util.Arrays;

class Solution {
    long findNum(long num) {
        // (num + 1)와 num의 OR 연산 결과에 NOT 연산을 적용해 가장 낮은 비트의 0을 찾습니다.
        long lowestZeroBit = (~num) & (num + 1);

        // 가장 낮은 0의 위치에 1을 설정한 다음, num에서 가장 낮은 1의 위치를 왼쪽으로 시프트하여 더해줍니다.
        return num + lowestZeroBit - (lowestZeroBit >> 1);
    }



    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i=0;i<numbers.length;i++) {
            long num = numbers[i];

            if(num % 2 == 0) {
                answer[i] = num + 1;
            }
            else {
                answer[i] = findNum(num);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new long[]{2, 31})));
    }
}
