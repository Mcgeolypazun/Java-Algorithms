package july.ju28;

import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(dartResult.charAt(0) - '0');
        int idx = 0;
        int start = 1;
        if(list.get(0) == 1){
            if(dartResult.charAt(1) == '0'){
                list.set(0,10);
                start++;
            }
        }

        for(int i=start;i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            if(c == '*'){
                list.set(idx,list.get(idx)*2);
                if(list.size() > 1)
                    list.set(idx-1,list.get(idx-1)*2);
            }else if(c == '#'){
                list.set(idx,-list.get(idx));
            }
            else if(c >= '0' && c <= '9'){
                if(c == '1'){
                    if(dartResult.charAt(i+1) == '0'){
                        list.add(10);
                        idx+=1;
                        i++;
                        continue;
                    }
                }
                list.add(c - '0');
                idx++;
            }else if(c == 'S'){
                list.set(idx,(int)Math.pow(list.get(idx),1));
            }else if(c == 'D'){
                list.set(idx,(int)Math.pow(list.get(idx),2));
            }else if(c == 'T'){
                list.set(idx,(int)Math.pow(list.get(idx),3));
            }

        }

        for(int i=0;i<list.size();i++){
            answer += list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(	"10D4S10D"));
    }
}
