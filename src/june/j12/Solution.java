package june.j12;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static boolean flag = true;
    static int sum = 0;
    void DFS(String word,char[] words,StringBuilder str){
        if(str.length() == 6){
            sum--;
            return ;
        }
        if(str.toString().equals(word)){
            flag = false;
            return ;
        }

        for(int i=0;i<words.length;i++){
            if(flag){
                str.append(words[i]);
                sum++;
                DFS(word,words,str);
                str.deleteCharAt(str.length()-1);
            }
            else{
                return ;
            }
        }


    }

//    public int solution(String word) {
//        char[] words = new char[]{'A', 'E', 'I', 'O', 'U'};
//        StringBuilder str = new StringBuilder();
//
//        DFS(word,words,str);
//
//        return sum;
//    }

    public int solution(String word) {
        int answer = 0, per = 3905;
        for(String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution("E"));
    }
}