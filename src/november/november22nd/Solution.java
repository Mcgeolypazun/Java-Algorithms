package november.november22nd;


import java.util.Scanner;

public class Solution {
    public String solution(String s) {
        String answer = "";
        char charArr[] = s.toCharArray();

        for(int i=0;i<charArr.length;i++){
            int curJ = 0;
            char maxChar = charArr[i];
            for(int j=i+1;j<charArr.length;j++){
                if(maxChar<charArr[j]){
                    maxChar = charArr[j];
                    curJ = j;
                }
            }
            if(curJ != 0) {
                char tmp = charArr[i];
                charArr[i] = maxChar;
                charArr[curJ] = tmp;
            }
        }
        answer = String.valueOf(charArr);

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.next()));
    }
}
