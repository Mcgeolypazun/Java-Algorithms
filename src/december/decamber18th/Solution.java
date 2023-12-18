package december.decamber18th;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {

        Map<String,Integer> stringToIntAlpha = new HashMap<>();
        stringToIntAlpha.put("zero",0);
        stringToIntAlpha.put("one",1);
        stringToIntAlpha.put("two",2);
        stringToIntAlpha.put("three",3);
        stringToIntAlpha.put("four",4);
        stringToIntAlpha.put("five",5);
        stringToIntAlpha.put("six",6);
        stringToIntAlpha.put("seven",7);
        stringToIntAlpha.put("eight",8);
        stringToIntAlpha.put("nine",9);

        for (String word : stringToIntAlpha.keySet()) {
            s = s.replaceAll(word, String.valueOf(stringToIntAlpha.get(word)));
        }

        return Integer.parseInt(s);

    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String s = "one2three3"; //->1233
        System.out.println(T.solution(s));
    }
}
