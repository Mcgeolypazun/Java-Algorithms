package august.aug5;

import java.util.*;
import java.math.*;

class Hanoi {
    public int priority;
    public int preNum;

    public Hanoi(int priority) {
        this.priority = priority;
    }
}

class Solution {
    public static int nowNum = 0;
    public int[][] solution(int n) {
        int[][] answer = new int[(int)Math.ceil(Math.pow(2,n))-1][2];

        Stack<Hanoi> a = new Stack<>();
        Stack<Hanoi> b = new Stack<>();
        Stack<Hanoi> c = new Stack<>();

        for(int i=n;i>=1;i--) {
            a.push(new Hanoi(i));
            if(n % 2 == 0)
                if(i % 2 != 0) {
                    a.peek().preNum = 3;
                } else {
                    a.peek().preNum = 2;
                }

            if(n % 2 != 0)
                if(i % 2 != 0) {
                    a.peek().preNum = 2;
                } else {
                    a.peek().preNum = 3;
                }
        }

        int idx = 0;
        while(c.size() != n) {
            for(int i=0;i<2;i++){//a
                if(a.isEmpty() || (!a.isEmpty() && a.peek().priority == nowNum)) break;

                if(a.peek().preNum == 2 &&(c.isEmpty() || c.peek().priority > a.peek().priority)) {
                    c.push(a.pop());
                    c.peek().preNum = 1;
                    nowNum = c.peek().priority;

                    answer[idx][0] = 1;
                    answer[idx][1] = 3;
                    idx++;
                } else if (a.peek().preNum == 3 &&(b.isEmpty() || b.peek().priority > a.peek().priority)) {
                    b.push(a.pop());
                    b.peek().preNum = 1;
                    nowNum = b.peek().priority;

                    answer[idx][0] = 1;
                    answer[idx][1] = 2;
                    idx++;
                }
                if(c.size() == n) break;
            }
            if(c.size() == n) break;
            for(int i=0;i<2;i++){//b
                if(b.isEmpty() || (!b.isEmpty() && b.peek().priority == nowNum)) break;

                if(b.peek().preNum == 1 && (c.isEmpty() || c.peek().priority > b.peek().priority)) {
                    c.push(b.pop());
                    c.peek().preNum = 2;
                    nowNum = c.peek().priority;

                    answer[idx][0] = 2;
                    answer[idx][1] = 3;
                    idx++;
                } else if (b.peek().preNum == 3 && (a.isEmpty() || a.peek().priority > b.peek().priority)) {
                    a.push(b.pop());
                    a.peek().preNum = 2;
                    nowNum = a.peek().priority;

                    answer[idx][0] = 2;
                    answer[idx][1] = 1;
                    idx++;
                }
                if(c.size() == n) break;
            }
            if(c.size() == n) break;
            for(int i=0;i<2;i++){//c
                if(c.isEmpty() || (!c.isEmpty() && c.peek().priority == nowNum)) break;

                if(c.peek().preNum == 1 && (b.isEmpty() || b.peek().priority > c.peek().priority)) {
                    b.push(c.pop());
                    b.peek().preNum = 3;
                    nowNum = b.peek().priority;

                    answer[idx][0] = 3;
                    answer[idx][1] = 2;
                    idx++;
                } else if(c.peek().preNum == 2 && (a.isEmpty() || a.peek().priority > c.peek().priority)) {
                    a.push(c.pop());
                    a.peek().preNum = 3;
                    nowNum = a.peek().priority;

                    answer[idx][0] = 3;
                    answer[idx][1] = 1;
                    idx++;
                }
                if(c.size() == n) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.solution(2)));
    }
}