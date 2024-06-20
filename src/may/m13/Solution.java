package may.m13;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

class Node{
    int lat;
    int lon;
    String direction;
    Node(int lat,int lon,String direction){
        this.lat = lat;
        this.lon = lon;
        this.direction = direction;
    }
}

class Solution {
    Queue<Node> q;
    static String[] strArr = new String[]{"w","s","a","d"};

    int BFS(int lat,int lon,String direction,String[] board){
        int lv = 0;
        q.offer(new Node(lat,lon,strArr[0]));
        q.offer(new Node(lat,lon,strArr[1]));
        q.offer(new Node(lat,lon,strArr[2]));
        q.offer(new Node(lat,lon,strArr[3]));

        while(true){
            int size = q.size();
            lv++;
            for(int i=0;i<size;i++){

                Node node = q.poll();
                if(node.direction.equals("w")){
                    while(lat > 0 || board[lat].charAt(lon) != 'D'){
                        lat--;
                    }
                    lat++;
                    if(board[lat].charAt(lon) == 'G'){
                        return lv;
                    }
                    else{
                        q.offer(new Node(lat,lon,"s"));
                        q.offer(new Node(lat,lon,"a"));
                        q.offer(new Node(lat,lon,"d"));
                    }
                }
                else if(node.direction.equals("s")){
                    while(lat < board.length || board[lat].charAt(lon) != 'D'){
                        lat++;
                    }
                    lat--;
                    if(board[lat].charAt(lon) == 'G'){
                        return lv;
                    }
                    else{
                        q.offer(new Node(lat,lon,"w"));
                        q.offer(new Node(lat,lon,"a"));
                        q.offer(new Node(lat,lon,"d"));
                    }
                }
                else if(node.direction.equals("a")){
                    while(lon < board.length || board[lat].charAt(lon) != 'D'){
                        lat++;
                    }
                    lat--;
                    if(board[lat].charAt(lon) == 'G'){
                        return lv;
                    }
                    else{
                        q.offer(new Node(lat,lon,"w"));
                        q.offer(new Node(lat,lon,"a"));
                        q.offer(new Node(lat,lon,"d"));
                    }
                }
            }
        }
    }

    public int solution(String[] board) {
        int answer = 0;
        q = new LinkedList<>();
        int lat = 0;
        int lon = 0;
        String direction = "";
        outerLoop:
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length();j++){
                if(board[i].charAt(j) == 'R'){
                    lat = i;
                    lon = j;
                    break outerLoop;
                }
            }
        }
        answer = BFS(lat,lon,direction,board);

        return answer;

    }
}