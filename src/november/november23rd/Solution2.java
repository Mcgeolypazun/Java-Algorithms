package november.november23rd;

import java.util.Scanner;

public class Solution2 {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arrChar = s.toCharArray();

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(int i=0;i<arrChar.length;i++){
            if(arrChar[i] >= 65 && arrChar[i] <= 90 || arrChar[i] <= 122 && arrChar[i] >= 97)
                return false;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
