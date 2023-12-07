package november.november20th;

import java.util.Scanner;

public class Solution2 {
    public String solution(String s) {
        String answer = "";
        char charArr[] = s.toCharArray();

        if(charArr.length % 2 == 0){
            char tempChar[] = new char[2];
            tempChar[0] = charArr[charArr.length/2-1];
            tempChar[1] = charArr[charArr.length/2];
            answer = String.valueOf(tempChar);
        }
        else{
            answer = String.valueOf(charArr[charArr.length/2]);
        }



        return answer;
    }

    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        System.out.println(T.solution(n));
    }
}
