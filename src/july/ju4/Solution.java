package july.ju4;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder result = new StringBuilder();
        int num = t * m;
        int curNum = 0;
        int loop = 0;
        while(loop != num){
            String changeableNum = Integer.toString(curNum++,n);
            for(int i=0;i<changeableNum.length();i++){
                if(loop != 0 && loop % (m)-p+1 == 0){
                    result.append(changeableNum.toUpperCase().charAt(i));
                }
                else if(loop == p-1){
                    result.append(changeableNum.toUpperCase().charAt(i));
                }
                loop++;
                if(loop == num) break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;

        System.out.println(T.solution(n,t,m,p));
    }
}
