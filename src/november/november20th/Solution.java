package november.november20th;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        OptionalInt minAnswer = OptionalInt.of(0);

        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[arr.length-1];

        minAnswer = Arrays.stream(arr).min();

        OptionalInt finalMinAnswer = minAnswer;
        answer = Arrays.stream(arr).filter(a->a > finalMinAnswer.getAsInt()).toArray();



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(arr)){
            System.out.print(x+" ");
        }
    }
}
