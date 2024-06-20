package may.m2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35];
    int combination(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combination(n-1,r-1) + combination(n-1,r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();

        System.out.println(T.combination(n,r));
    }
}
