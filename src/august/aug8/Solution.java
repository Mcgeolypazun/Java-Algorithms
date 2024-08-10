package august.aug8;

import java.util.*;

class CurLoCa {
    public String dir;
    public int i;
    public int j;

    public CurLoCa(String dir,int i,int j) {
        this.dir = dir;
        this.i = i;
        this.j = j;
    }
}

class Solution {
    static int[] startIdx = new int[2];
    static int[] endIdx = new int[2];

    int BFS(char[][] twoDiBoard) {
        Queue<CurLoCa> q = new LinkedList<>();
        int vertiFirstIdx = 1;
        int horiFirstIdx = 1;
        int vertiMaxIdx = twoDiBoard.length - 2;
        int horiMaxIdx = twoDiBoard[0].length - 2;

        int[][] visited = new int[twoDiBoard.length][twoDiBoard[0].length];
        q.add(new CurLoCa("출발",startIdx[0],startIdx[1]));
        int lv = 0;
        while(!q.isEmpty()) {
            int len = q.size();

            for(int k=0;k<len;k++) {
                CurLoCa cur = q.poll();
                int i = cur.i;
                int j = cur.j;
                String preDir = cur.dir;

                if(!preDir.equals("상") && twoDiBoard[i-1][j] != '0' && twoDiBoard[i-1][j] != 'D') {
                    for(int z = i;z >= 1;z--) {
                        if(twoDiBoard[z-1][j] == '0' || twoDiBoard[z-1][j] == 'D') {
                            if(twoDiBoard[z][j] == 'G') {
                                return lv+1;
                            }
                            if(visited[z][j] != -1) {
                                q.add(new CurLoCa("상",z,j));
                                visited[z][j] = -1;
                            }
                            break;
                        }

                    }
                }
                if(!preDir.equals("하") && twoDiBoard[i+1][j] != '0' && twoDiBoard[i+1][j] != 'D') {
                    for(int z = i;z <= vertiMaxIdx;z++) {
                        if(twoDiBoard[z+1][j] == '0' || twoDiBoard[z+1][j] == 'D') {
                            if(twoDiBoard[z][j] == 'G') {
                                return lv+1;
                            }
                            if(visited[z][j] != -1) {
                                q.add(new CurLoCa("하",z,j));
                                visited[z][j] = -1;
                            }


                            break;
                        }

                    }
                }
                if(!preDir.equals("좌") && twoDiBoard[i][j-1] != '0' && twoDiBoard[i][j-1] != 'D') {
                    for(int z = j;z >= 1;z--) {
                        if(twoDiBoard[i][z-1] == '0' || twoDiBoard[i][z-1] == 'D') {
                            if(twoDiBoard[i][z] == 'G') {
                                return lv+1;
                            }
                            if(visited[i][z] != -1) {
                                q.add(new CurLoCa("좌",i,z));
                                visited[i][z] = -1;
                            }


                            break;
                        }

                    }
                }
                if(!preDir.equals("우") && twoDiBoard[i][j+1] != '0' && twoDiBoard[i][j+1] != 'D') {
                    for(int z = j;z <= horiMaxIdx;z++) {
                        if(twoDiBoard[i][z+1] == '0' || twoDiBoard[i][z+1] == 'D') {
                            if(twoDiBoard[i][z] == 'G') {
                                return lv+1;
                            }
                            if(visited[i][z] != -1) {
                                q.add(new CurLoCa("우",i,z));
                                visited[i][z] = -1;
                            }

                            break;
                        }

                    }
                }
            }
            lv++;
        }
        return -1;
    }

    public int solution(String[] board) {
        int answer = 0;
        int boardSize = board.length;
        char[][] twoDiBoard = new char[boardSize + 2][board[0].length() + 2];

        for (int i = 0; i < boardSize + 2; i++) {
            for (int j = 0; j < board[0].length() + 2; j++) {
                twoDiBoard[i][j] = '0';
            }
        }

        for(int i=1;i<=boardSize;i++) {
            for(int j=1;j<=board[0].length();j++) {
                twoDiBoard[i][j] = board[i-1].charAt(j-1);

                if(twoDiBoard[i][j] == 'R') {
                    startIdx[0] = i;
                    startIdx[1] = j;
                }
                else if(twoDiBoard[i][j] == 'G') {
                    endIdx[0] = i;
                    endIdx[1] = j;


                }
            }
        }

        if(twoDiBoard[endIdx[0]-1][endIdx[1]] == '.' && twoDiBoard[endIdx[0]+1][endIdx[1]] == '.' && twoDiBoard[endIdx[0]][endIdx[1]-1] == '.' && twoDiBoard[endIdx[0]][endIdx[1]+1] == '.') {
            return -1;
        }

        answer = BFS(twoDiBoard);

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] str = new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        System.out.println(T.solution(str));
    }
}

