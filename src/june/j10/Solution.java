package june.j10;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CompareValue implements Comparator<Map.Entry<Integer,Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        return e2.getValue().compareTo(e1.getValue());
    }
}

class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution.solution(s))); // [2, 1, 3, 4]
    }
}