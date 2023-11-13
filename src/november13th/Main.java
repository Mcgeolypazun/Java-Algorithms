package november13th;

import java.util.Scanner;

public class Main {
    static int limitTime;
    static int maxPoint = 0;
    static int questions[][];

    public void DFS(int L,int sum, int subLimitTime){
        if(subLimitTime > limitTime) return;
        if(L == questions.length){
            maxPoint = Math.max(maxPoint,sum);
        }
        else {

            DFS(L + 1, sum+questions[L][0], subLimitTime+questions[L][1]);
            DFS(L+1,sum, subLimitTime);

        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int numberOfQuestions = kb.nextInt();
        limitTime = kb.nextInt();
        questions = new int[numberOfQuestions][2];
        for (int i=0;i<numberOfQuestions;i++){
            for(int j=0;j<2;j++){
                questions[i][j] = kb.nextInt();
            }
        }

        T.DFS(0,0,0);
        System.out.println(maxPoint);

    }
}
