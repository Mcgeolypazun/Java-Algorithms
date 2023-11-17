package november17th;
import java.util.*;

public class Solution {
    /* 21번 문제
    public boolean solution(int x) {
        boolean answer = true;
        int arr[];
        int originalValue = x;
        int sum = 0;

        int count = 0;
        for(int i=1;i<=x;i=i*10){
            count++;
        }

        arr = new int[count];

        for(int i=0;i<count;i++){
            arr[i] = x%10;
            x = x/10;
        }

        for(int i=0;i<count;i++){
            sum += arr[i];
        }
        if(originalValue%sum == 0){
            answer = true;
        }
        else{
            answer = false;
        }



        return answer;
    }*/
    /*22번 문제
    public long solution(int a, int b) {
        long answer = 0;

        if(a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        else if(b < a){
            for(int i=b;i<=a;i++){
                answer += i;
            }
        }
        else {
            return b;
        }

        return answer;
    }*/
//    1-1. 입력된 수가 짝수라면 2로 나눕니다.
//            1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//            2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
   /* 23번 문제
    public int solution(int num) {
        int answer = 0;
        int count = 0;

        while(num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            count++;
            if(count >= 500){
                return -1;
            }
        }
        answer = count;

        return answer;
    }*/
    /* 24번 문제
    public String solution(String[] seoul) {
        String answer = "";
        int count = 0;

        for(String x:seoul){
            if(x.equals("Kim")){
                answer = "김서방은 "+count+"에 있다";
            }
            else{
                count++;
            }
        }

        return answer;
    }*/

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        int answerCount = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
                answerCount++;
            }
            else{

            }
        }

        if(answerCount == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[answerCount];
            for(int i=0;i<arrList.size();i++){
                answer[i] = arrList.get(i);
            }
        }

        Arrays.sort(answer);

        return answer;
    }//Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        //System.out.println(T.solution(kb.nextInt()));
        int a = kb.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = kb.nextInt();
        }
        int divisor = kb.nextInt();

        for(int x:T.solution(arr,divisor)){
            System.out.print(x+" ");
        }

    }
}
