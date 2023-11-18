package november18th;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//
//        for(int i=0;i<absolutes.length;i++){
//            if(signs[i] == false){
//                absolutes[i] = -absolutes[i];
//            }
//            answer += absolutes[i];
//        }
//
//            AtomicInteger index = new AtomicInteger();
//            return Arrays.stream(absolutes).reduce(0, (i, i1) -> {
//                index.getAndIncrement();
//                return signs[index.get() - 1] ? i + i1 : i - i1;
//            });
//
//
//        //return answer;
//    }

    public String solution(String phone_number) {
        String answer = "";
        char[] charArr = phone_number.toCharArray();

        for(int i=0;i<charArr.length-4;i++){
            charArr[i] = '*';
        }

        answer = String.valueOf(charArr);


        return answer;
    }
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
//        int absolutes[] = new int[n];
//        boolean signs[] = new boolean[n];
//
//        for(int i=0;i<n;i++){
//            absolutes[i] = kb.nextInt();
//            signs[i] = kb.nextBoolean();
//        }

        System.out.println(T.solution(n));
    }
}
