package june.j21;

import java.util.*;

class Solution {
    // BFS 메소드
    static int BFS(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 이동 방향 (상, 하, 좌, 우)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 방문 여부 체크 배열
        boolean[][] visited = new boolean[n][m];

        // 큐 초기화 (x, y, 거리)
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        ArrayList<Integer> start = new ArrayList<>(Arrays.asList(0, 0, 1));
        q.add(start);
        visited[0][0] = true;

        while (!q.isEmpty()) {
            ArrayList<Integer> current = q.poll();
            int x = current.get(0);
            int y = current.get(1);
            int distance = current.get(2);

            // 목표 위치에 도달했을 때
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 이동 가능한 위치인지 확인
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    ArrayList<Integer> next = new ArrayList<>(Arrays.asList(nx, ny, distance + 1));
                    q.add(next);
                }
            }
        }

        // 목표 위치에 도달할 수 없는 경우
        return -1;
    }

    // solution 메소드
    public int solution(int[][] maps) {
        return BFS(maps);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

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

