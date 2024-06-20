package april.a18;

import java.util.Objects;
import java.util.Stack;

import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer;
        char msgChar[] = msg.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int idx = 26;
        for(int i=0;i<26;i++){
            map.put((char)(65+i)+"",i+1);
        }

        String tmp = "";
        String pre = "";
        for(int i=0;i<msgChar.length-1;i++){

            for(int j=i;j<msgChar.length-1;j++){
                pre = tmp;
                tmp += map.get(j)+"";

                if(!map.containsKey(tmp)){
                    map.put(tmp,idx+1);
                    arr.add(map.get(pre));
                    idx++;
                    i = j;
                    break;
                }
            }
            tmp = "";
            pre = "";
        }

        answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}