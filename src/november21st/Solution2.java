package november21st;

import java.util.Scanner;

public class Solution2 {

    int countFactors(int n){
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                answer++;
            }
        }
        return answer;
    }
    boolean checkFactors(int n){
        if(n % 2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int solution(int left, int right) {
        int answer = 0;

       for(int i=left;i<=right;i++){
           if(checkFactors(countFactors(i))){
               answer += i;
           }
           else{
               answer -= i;
           }
       }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner kb = new Scanner(System.in);
        int aa = kb.nextInt();
        int bb = kb.nextInt();
        System.out.println(T.solution(aa,bb));
    }
}

//class Solution {
//    public int solution(int left, int right) {
//        int answer = 0;
//
//        for (int i=left;i<=right;i++) {
//            //제곱수인 경우 약수의 개수가 홀수
//            if (i % Math.sqrt(i) == 0) {
//                answer -= i;
//            }
//            //제곱수가 아닌 경우 약수의 개수가 짝수
//            else {
//                answer += i;
//            }
//        }
//
//        return answer;
//    }
//}
