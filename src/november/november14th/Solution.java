package november.november14th;
import java.util.*;
public class Solution {
    public int solution(int n) {
//        int answer = 0;
//        for(int i=1;i <= n;i=i*10){
//            int single = (n/i)%10;
//            answer += single;
//        }
//
//        return answer;

//            int answer = 0;
//
//            for (int i = 1; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    answer += i;
//                }
//            }
//
//            return answer + n; // Include n itself in the sum of factors

        int answer = 0;

        for(int i=1;i<n;i++){
            if(n%i == 1) return answer = i;
        }

        return answer;

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}