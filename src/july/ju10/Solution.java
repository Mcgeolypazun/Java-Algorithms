package july.ju10;

import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] left = new int[10001], right = new int[10001];
        int ls = 0, rs = 0;
        for(var i : topping) right[i]++;
        for(var i : right) rs += i > 0 ? 1 : 0;
        for(var i : topping) {
            right[i]--;
            if (right[i] == 0) rs--;
            if (left[i] == 0) ls++;
            left[i]++;
            if (rs == ls) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int a[] = new int[]{1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(T.solution(a));
    }
}