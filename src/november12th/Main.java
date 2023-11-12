package november12th;

import java.util.Scanner;

public class Main {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = num1*num2;
            return answer;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Main.Solution TS = T.new Solution();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        System.out.println(TS.solution(num1, num2));
    }
}
