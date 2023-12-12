package december.december12th;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char charArr[] = t.toCharArray();
        char charArr2[] = p.toCharArray();
        int size = charArr.length - charArr2.length+1;
        int trimSize = charArr2.length;
        int pInt = Integer.parseInt(p);
        int count = 0;
        String stringValue = "";

        for(int i =0;i<size;i++){
            for(int j=i;j<trimSize;j++){
                stringValue += charArr[j];
            }
            int a = Integer.parseInt(stringValue);
            if(a >= pInt){
                count++;
            }
            stringValue = "";
        }

        return count;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        T.solution("43295843","434");
    }
}
