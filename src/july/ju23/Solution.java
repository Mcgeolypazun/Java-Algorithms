package july.ju23;

import java.util.*;
class Solution {
    static int min = Integer.MAX_VALUE;

    public void DFS(String begin, String target, String[] words,int cnt,String[] copy){
        if(min < cnt) return ;
        if(begin.equals(target)){
            cnt--;
            if(min > cnt){
                min = cnt;
            }
            return ;
        }

        for(int i=0;i<copy.length;i++){
            String[] copyWords = Arrays.copyOf(copy,copy.length);
            copyWords[i] = "-";
            if(copy[i].equals("-")) continue;
            String word = copy[i];
            int wordCnt = 0;

            for(int j=0;j<word.length();j++){
                char cWord = word.charAt(j);
                char cBegin = begin.charAt(j);

                if(cWord == cBegin) wordCnt++;

                if(wordCnt == word.length()-1){
                    DFS(word,target,words,cnt+1,copyWords);
                }
            }
        }


    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        DFS(begin,target,words,1,words);
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};
        System.out.println(T.solution(begin, target, words)); // 3
    }
}
