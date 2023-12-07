package november.november30th;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char charArr[] = t.toCharArray();
        char charArr2[] = p.toCharArray();
        char[] tmp = new char[charArr2.length];
        int second = Integer.parseInt(p);
        int count = 0;
        for(int i=0;i<charArr.length-(charArr2.length-1);i++){
            for(int j = i;j<i+charArr2.length;j++){
                tmp[count] = charArr[j];
                count++;
            }
            count = 0;
            String tmp2 = String.valueOf(tmp);
            int intTmp = Integer.parseInt(tmp2);
            if(intTmp <= second) answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        String t = "300300300";
        String s = "300";

        System.out.println(T.solution(s,t));

    }
}
