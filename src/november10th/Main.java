package november10th;

import java.util.Scanner;

//합이 같은 부분집합
public class Main {
//    static int n;
//    static int arr[];
//    static int ch[];
//
//    static int total = 0;
//    static int antotal = 0;
//    int L = 0;
//    void DFS(){
//        if(L > 1 && antotal == total){
//            System.out.println("YES");
//        }
//
//
//        if(L < arr.length) {
//            total += arr[L];
//            antotal -= arr[L];
//            L++;
//            DFS();
//            L--;
//            total -= arr[L];
//            antotal += arr[L];
//        }
//
//
//        if(L == 0 && antotal != total){
//            System.out.println("NO");
//        }
//    }

    static String answer = "NO";
    static int n,total = 0;
    boolean flag = false;
    public void DFS(int L,int sum, int[] arr){
        if(flag) return;
        if(sum > total/2){
            return;
        }
        if(L==n){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }
        }
        else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }

    int sum(int arr[]){
        int answer = 0;
        for(int x:arr){
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb= new Scanner(System.in);
         n = kb.nextInt();
//        arr = new int[n+2];
//        arr[0] = 0;
//        arr[arr.length-1] = 0;
//        for(int i=1;i<=n;i++){
//            arr[i] = kb.nextInt();
//        }
//        ch = new int[n];
//        antotal = T.sum(arr);
//        T.DFS();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}

/*
*N개의 원소로 구성된 자연수 집합
* 두개의 부분 집합 분할
* 합이 서로 같은 경우 세기
 */