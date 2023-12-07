package november.november20th;

import java.util.Scanner;

public class Solution3 {
    public String solution(int n) {
        StringBuilder strBuilder = new StringBuilder();
        int count = 0;

        while(count < n){
            if(count % 2 == 0){
                strBuilder.append("수");
            }
            else{
                strBuilder.append("박");
            }
            count++;
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        Solution3 T = new Solution3();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextInt()));
    }
}
