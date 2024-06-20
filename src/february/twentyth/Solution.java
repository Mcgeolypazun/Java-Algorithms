//package february.twentyth;
//
//class Solution {
//    public int[] solution(String wallpaper) {
//        int[] answer = new int[wallpaper.length];
//
//        String[] s = wallpaper;
//        int strLength = wallpaper[0].length();
//        char[][] charArr = new char[s.length][strLength];
//        int maxX = 0;
//        int maxY = 0;
//        int minX = 100000;
//        int minY = 100000;
//
//        for(int i=0;i<s.length;i++){
//            for(int j=0;j<strLength;j++){
//                charArr[i][j] = wallpaper[0].charAt(j);
//                if(maxX < i){
//                    maxX = i;
//                }
//                if(minX > i){
//                    minX = i;
//                }
//                if(maxY < j){
//                    maxY = j;
//                }
//                if(minY > j){
//                    minY = j;
//                }
//            }
//        }
//
//        answer[0] = minX;
//        answer[1] = maxX;
//        answer[2] = minY;
//        answer[3] = maxY;
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution T = new Solution();
//
//        System.out.println("T.solution(23) = " + T.solution("1 2 Z 3"));
//    }
//}
