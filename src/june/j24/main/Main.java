package june.j24.main;

import java.util.Scanner;

public class Main {
    public int solution(int stairs){
        int one = 1;
        int two = 2;
        int[] arr = new int[stairs+1];
        arr[1] = one;
        arr[2] = two;

        for(int i=3;i<=stairs;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[stairs];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        System.out.println(T.solution(kb.nextInt()));
    }
}
