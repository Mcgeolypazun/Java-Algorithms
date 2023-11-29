package november28th;

public class Solution {
    public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = s.toCharArray();
        int number = 0;
        String k = "";
        for(int i=0;i<charArr.length;i++){
            k = String.valueOf(charArr[i]);
            if(charArr[i] == ' '){
                number = 0;
                answer.append(k);
                continue;
            }
            else if(number % 2 == 0){
                k = k.toUpperCase();

            }
            else if(number %2 != 0){
                k = k.toLowerCase();
            }
            number++;
            answer.append(k);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution("Hello world good"));
    }
}
