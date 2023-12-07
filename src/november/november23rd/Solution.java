package november.november23rd;

import java.util.Scanner;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for(int i=0;i<count;i++){
            answer -= (price*(i+1));
        }


        return (answer > 0? 0 : -answer);
    }

//    public long solution(int price, int money, int count) {
//        long totalCost = (long) price * count * (count + 1) / 2;
//        long requiredMoney = totalCost - money;
//
//        return requiredMoney > 0 ? requiredMoney : 0;
//    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);
        int price = kb.nextInt();
        int money = kb.nextInt();
        int count = kb.nextInt();
        System.out.println(T.solution(price,money,count));
    }
}
