package december.december14th;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char charArr[] = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(charArr[i] == 32){
                continue;
            }
            for(int j=0;j<n;j++) {
                charArr[i] = (char) (charArr[i] + 1);
                if(charArr[i] == 'z'+1){
                    charArr[i] = 'a';
                }
                else if(charArr[i] == 'Z'+1){
                    charArr[i] = 'A';
                }
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    public String caesar(String s, int _n) {
        return s.chars().map(c -> {
                    int n = _n % 26;
                    if (c >= 'a' && c <= 'z') {
                        return 'a' + (c - 'a' + n) % 26;
                    } else if (c >= 'A' && c <= 'Z') {
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char)c))
                .reduce((a, b) -> a + b).orElse("");
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution("a B z",4));
        System.out.println(T.caesar("a B z",4));
    }
}
