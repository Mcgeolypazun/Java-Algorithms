package december.december12th;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Solution {
    public int solution(String t, String p) {
        char[] charArr = t.toCharArray();
        int size = charArr.length - p.length() + 1;
        char charArr2[] = p.toCharArray();
        Long pInt = Long.parseLong(p);
        int count = 0;

        Long a;

        for(int i =0;i<size;i++){
            String stringValue = "";
            for(int j=i;j<p.length()+i;j++){
                stringValue += charArr[j];
            }
            if(stringValue.isEmpty()){
                 a = 0L;
            }else {
                 a = Long.parseLong(stringValue);
            }
            if(a <= pInt){
                count++;
            }

        }

        return count;
    }

    public int solution2(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }


    public int solution3(String t, String p) {
        char[] charArr = t.toCharArray();
        int size = charArr.length - p.length() + 1;
        BigInteger pInt = new BigInteger(p);
        int count = 0;

        for (int i = 0; i < size; i++) {
            StringBuilder stringValue = new StringBuilder();
            for (int j = i; j < p.length() + i; j++) {
                stringValue.append(charArr[j]);
            }
            BigInteger a = new BigInteger(stringValue.toString());
            if (a.compareTo(pInt) <= 0) {
                count++;
            }
        }
        return count;
    }

    public int solution4(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }


    public static void main(String[] args) {
        Solution T = new Solution();

        System.out.println("T.solution4(\"500220839878\",\"7\") = " + T.solution4("500220839878","7"));
    }
}
