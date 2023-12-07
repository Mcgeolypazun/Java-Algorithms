package november.november12th;


import java.util.Scanner;

public class Main {
    static int ch[];
    static int dogsWeight[];
    static int count = 0;
    static int truck;
    void DFS(int v,int currentCount){


        if(count < currentCount && truck > currentCount){
            count = currentCount;
        }
        if(v == dogsWeight.length) return;
        DFS(v+1,currentCount+dogsWeight[v]);
        DFS(v+1,currentCount);
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        truck = kb.nextInt();
        int dogs = kb.nextInt();
        dogsWeight = new int[dogs];
        for(int i=0;i<dogs;i++){
            dogsWeight[i] = kb.nextInt();
        }
        int v = 0;
        int currentCount = 0;

        T.DFS(v,currentCount);
        System.out.println(count);

    }
}


class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
        }
        answer = (double)answer/numbers.length;

        return answer;
    }
}