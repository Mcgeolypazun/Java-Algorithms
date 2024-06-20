package april.a29;

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++){
            int[] paste = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(paste);
            answer[i] = paste[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution.solution(array, commands);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
