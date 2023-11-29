package november26th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int solution(int n) {
        int answer = 1;
        ArrayList<Integer> arrList;
        int count = 0;
        for(int i=3;i<=n;i=i*3){//배열의 칸수지정을 위함
            count++;
        }
        int room = count;
        int arr[] = new int[count+1];
            while(room >= 0) {
                int three = 1;

                for (int i = 0; i < 2; i++) {//3진법 형태 2바퀴를 돌면 다음 수로 진행
                    int j;
                    for (j = count; j >= 0; j--) {//n보다 작으면 arr의 해당 제곱수를 높임
                        if (j == count) {
                            continue;
                        }
                        three = three * 3;

                    }
                    if (three <= n) {
                        arr[count]++;
                        n = n - three;
                    }
                    three = 1;
                }
                room -= 1;
                count -= 1;
            }

             int size = 0;
            for(int j=0;j<arr.length-1;j++) {//배열의 자릿수
                int sum = 1;
                for (int i = 0 ; i < arr.length-size-1; i++) {//세제곱 반복횟수 배열의 자릿수가 3이면 3번 곱함
                    sum *= 3;

                }
                size += 1;
                answer += sum*arr[j];
                //구한 배열 자릿수에 * arr[j]를 구해줌
            }

        return  answer;
    }

    public int solution2(int n) {
        // n을 3진법으로 변환하여 문자열로 저장
        String ternary = "";
        while (n > 0) {
            ternary += n % 3;
            n /= 3;
        }

        // 3진법으로 변환된 문자열을 뒤집기
        StringBuilder reversed = new StringBuilder(ternary).reverse();

        // 뒤집힌 3진법 문자열을 10진법으로 변환
        int answer = 0;
        int pow = 1;
        for (int i = 0; i < reversed.length(); i++) {
            int digit = reversed.charAt(i) - '0';
            answer += digit * pow;
            pow *= 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = 0;
        while(n<3) {
            System.out.println(T.solution(n));
//            System.out.println(T.solution2(n));
            if(T.solution2(n) - T.solution(n) >= 1){
                System.out.println(n+"번째 - T.solution2(n)-T.solution(n) = "+(T.solution2(n)-T.solution(n)));
            }
            n++;
        }
        kb.close();
    }
}
