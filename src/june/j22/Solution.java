package june.j22;

import java.util.*;

class Solution {
    int BFS(int[][] maps) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int lv = 1;
        int[] row = new int[]{-1, 1, 0, 0};
        int[] col = new int[]{0, 0, 1, -1};
        int destinRow = maps.length - 1;
        int destinCol = maps[0].length - 1;
        boolean[][] visited = new boolean[destinRow + 1][destinCol + 1];

        ArrayList<Integer> start = new ArrayList<>(Arrays.asList(0, 0));
        q.offer(start);
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();  // 현재 레벨의 노드 수
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> current = q.poll();
                int curRow = current.get(0);
                int curCol = current.get(1);

                // 목표 위치에 도달했을 때
                if (curRow == destinRow && curCol == destinCol) {
                    return lv;
                }

                // 네 방향으로 이동
                for (int j = 0; j < row.length; j++) {
                    int newRow = curRow + row[j];
                    int newCol = curCol + col[j];

                    // 이동 가능한 위치인지 확인
                    if (newRow >= 0 && newCol >= 0 && newRow <= destinRow && newCol <= destinCol
                        && maps[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                        ArrayList<Integer> next = new ArrayList<>(Arrays.asList(newRow, newCol));
                        q.offer(next);
                        visited[newRow][newCol] = true;
                    }
                }
            }
            lv++;
        }

        // 목표 위치에 도달할 수 없는 경우
        return -1;
    }

    public int solution(int[][] maps) {
        return BFS(maps);
    }

    public static void main(String[] args) {
        june.j22.Solution sol = new june.j22.Solution();

        int[][] maps1 = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 0, 1}
        };
        System.out.println(sol.solution(maps1)); // 11

        int[][] maps2 = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 1}
        };
        System.out.println(sol.solution(maps2)); // -1
    }
}

