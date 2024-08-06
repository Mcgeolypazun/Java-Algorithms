package july.ju13;

import java.math.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Vec{
    public int x;
    public int y;
    public Set<Character> set = new HashSet<>();

    public Vec(int x,int y){
        this.x = x;
        this.y = y;
    }

}
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[][] field = new int[11][11];
        List<ArrayList<ArrayList<Character>>> list = new ArrayList<>();

        for(int i=0;i<11;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++)
                list.get(i).add(new ArrayList<>());
        }

        int dx = 5;
        int dy = 5;
        int preX = 0;
        int preY = 0;

        for(int i=0;i<dirs.length();i++){
            char c = dirs.charAt(i);
            boolean flag = false;
            //LULLLLLLU
            if(!list.get(dx).get(dy).contains(c)){
                list.get(dx).get(dy).add(c);
                flag = true;
                answer++;
            }

            if(c == 'U' && dx != 10){
                dx += 1;
                dy += 0;

                list.get(dx).get(dy).add('D');
            }
            else if(c == 'D' && dx != 0){
                dx += -1;
                dy += 0;

                list.get(dx).get(dy).add('U');
            }
            else if(c == 'R' && dy != 10){
                dx += 0;
                dy += 1;

                list.get(dx).get(dy).add('L');
            }
            else if(c == 'L' && dy != 0){
                dx += 0;
                dy += -1;

                list.get(dx).get(dy).add('R');
            }

            if(preX == dx && preY == dy && flag){
                answer--;
            }

            preX = dx;
            preY = dy;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution("LULLLLLLU"));
    }
}