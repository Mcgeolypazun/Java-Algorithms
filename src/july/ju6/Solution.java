package july.ju6;

class Solution {
    public int[] solution(int n) {
        int answerSize = 0;
        if(n == 1) return new int[]{1};
        if(n == 3) return new int[]{1,2,6,3,4,5};
        for(int i=1;i<=n;i++){
            answerSize += i;
        }
        int[] answer = new int[answerSize];
        int[][] arr = new int[n][n];
        //아래,오른쪽,왼쪽 위 대각,아래,오른쪽,왼쪽 위 대각...
        int i = 0;
        int j = 0;
        int curNum = 1;
        while(true){
            int exitNum = curNum;
            while(i < n && arr[i][j] == 0){
                arr[i++][j] = curNum++;
            }
            j++;
            i--;
            while(j < n && arr[i][j] == 0){
                arr[i][j++] = curNum++;
            }
            i--;
            j--;
            j--;
            while(arr[i][j] == 0){
                arr[i--][j--] = curNum++;
            }
            i++;
            i++;
            j++;
            if(exitNum == curNum){
                break;
            }
        }

        int answerIdx = 0;
        for(int k=0;k<arr.length;k++){
            for(int z=0;z<arr[k].length;z++){
                if(arr[k][z] != 0){
                    answer[answerIdx++] = arr[k][z];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        for(int x : T.solution(3)){
            System.out.print(x+" ");
        }
    }
}
