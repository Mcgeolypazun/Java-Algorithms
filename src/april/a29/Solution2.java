package april.a29;

import java.util.*;
class Solution2 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNumbers = new String[numbers.length];

        for(int i=0;i<strNumbers.length;i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int i=0;i<strNumbers.length;i++){
            answer.append(strNumbers[i]);
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        System.out.println("Result 1: " + solution2.solution(numbers1)); // 예상 결과: "6210"
        System.out.println("Result 2: " + solution2.solution(numbers2)); // 예상 결과: "9534330"
    }
}
