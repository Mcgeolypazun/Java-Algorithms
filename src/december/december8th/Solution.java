package december.december8th;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 125; // 예시로 주어진 값
        int result = sol.solution(n);
        System.out.println("결과: " + result);
    }
}
