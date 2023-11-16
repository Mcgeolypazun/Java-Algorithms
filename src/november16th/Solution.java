package november16th;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        answer = Integer.parseInt(s);
//
//        return answer;
//    }

//    public long solution(long n) {
//        long answer = 0;
//
//        double s = Math.sqrt(n);
//        long doubleN = (long)Math.sqrt(n);
//        //System.out.println(s+" "+doubleN);
//        if(s==(double)doubleN){
//            answer = (long)(s+1)*(long)(s+1);
//        }
//        else{
//            return -1;
//        }
//
//        return answer;
//    }


    public long solution(long n) {
        String numStr = Long.toString(n);

        // 문자열을 문자 배열로 변환
        char[] charArray = numStr.toCharArray();

        Arrays.sort(charArray);

        int lt = 0;
        int rt = charArray.length-1;
        while(lt < rt){
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;

            lt++;
            rt--;
        }

        // 정렬된 문자 배열을 다시 문자열로 합치고 정수로 변환하여 리턴
        String sortedNumStr = new String(charArray);
        long result = Long.parseLong(sortedNumStr);

        return result;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextLong()));
    }
}

    //함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.