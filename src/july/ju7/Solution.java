package july.ju7;

import java.util.*;

class Node {
    int num;
    List<Integer> linkedNode;
    List<Integer> fare;

    public Node(int num,List<Integer> linkedNode,List<Integer> fare){
        this.num = num;
        this.linkedNode = linkedNode;
        this.fare = fare;
    }

}

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        int[] nArr = new int[n+1];
        List<Node> nodes = new ArrayList<>();

        for(int[] fee : fares){

        }


        return answer;
    }
}
