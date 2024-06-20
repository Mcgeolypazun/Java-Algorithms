package february.tenth;

import java.util.Scanner;

public class Main {
    public int[] solution(int a,int b, int[] arr){


            for (int i = 0; i < a-1; i++) {
                for (int j = 0; j < a - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(j, j + 1, arr);
                    }
                }
            }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[a];

        for(int i=0;i<a;i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(a,b,arr)){
            System.out.println("x = " + x);
        }
    }

    public void swap(int first,int second,int arr[]){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
