package june.j22;

import java.util.*;

class Main {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // 현재 부분집합을 결과에 추가
        result.add(new ArrayList<>(current));

        // 현재 인덱스부터 시작하여 부분집합 생성
        for (int i = index; i < nums.length; i++) {
            // 현재 요소를 부분집합에 추가
            current.add(nums[i]);
            // 다음 인덱스를 사용하여 재귀 호출
            generateSubsets(i + 1, nums, current, result);
            // 현재 요소를 부분집합에서 제거 (백트래킹)
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] nums = {12, 6, 9};
        List<List<Integer>> subsets = sol.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}

