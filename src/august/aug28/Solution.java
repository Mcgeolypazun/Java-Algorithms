package august.aug28;

import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (!skip.contains(String.valueOf(ch))) {
                list.add(ch);
            }
        }

        for(char c : list) {
            System.out.println(c);
        }

//        for(int i=0;i<s.length();i++) {
//            int alphaIdx = s.charAt(i) - 'a';
//            int newIdx = (alphaIdx + index) % list.size();
//            System.out.println(newIdx);
//            answer += list.get(newIdx);
//        }
        //-> 알파벳 순서로 index를 생성하면 list와 매칭되지 않는 index가 생성된다.

         for (char c : s.toCharArray()) {
             // 현재 문자 인덱스를 구한다
             int originalIdx = list.indexOf(c);
             // 새로운 인덱스를 구한다 (순환 처리)
             int newIdx = (originalIdx + index) % list.size();
             // 변환된 문자를 결과 문자열에 추가
             answer += list.get(newIdx);
         }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aukks", "wbqd", 5));
    }
}
