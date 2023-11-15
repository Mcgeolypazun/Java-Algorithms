package november15th;

import java.util.Scanner;

class Solution {
//    public long[] solution(int x, int n) {
//        long[] answer;
//        answer = new long[n];
//        for(int i=0;i<n;i++){
//            answer[i] = (long) (i + 1) *x;
//        }
//        return answer;
//
//
//
//    }


    public long[] solution(long n) {
            long[] answer ;
            int count = 0;
            long digits = n;
        if (n == 0) {
            return new long[]{0};
        }

                int numberCount = 0;
                while(digits != 0){
                    digits = digits/10;
                    numberCount++;
                }
                answer = new long[numberCount];

            for(long i=1;i<=n;i=i*10){
                answer[count] = (n/i)%10;
                count++;
            }

//            for(int i=0;i<numberCount;i++){
//                long tmp = answer[i];
//                answer[i] = answer[(numberCount-i-1)];
//                answer[(numberCount-i-1)] = tmp;
//            }


            return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        long n = kb.nextLong();


        for(long k : T.solution(n)){
            System.out.print(k+" ");
        }
    }
}
