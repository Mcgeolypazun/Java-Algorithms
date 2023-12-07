package november.november24th;

import java.util.*;

import static java.lang.Thread.sleep;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }


    public static void main(String[] args) throws InterruptedException {
        Solution T = new Solution();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

//            for(int i=0;i<b;i++){
//                for(int j=0;j<a;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

           // System.out.println(a + b);

//       for(int x: T.solution(a,b)){
//           System.out.println(x+" ");
//       }


        for(int x : T.solution(a,b))
            System.out.print(x+" ");
    }


    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int[] nn = allResult(n);
        int[] mm = allResult(m);

        for(int i=0;i<nn.length;i++){
            for(int j=0;j<mm.length;j++){
                if(nn[i] == mm[j]){
                    answer[0] = nn[i];
                }
            }
        }
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        int count = 1;
        for(int i=n;i<=n*m;i=n*count){
            count++;
            arrList1.add(i);
        }
        count = 1;
        for(int j=m;j<=n*m;j = m*count){
            count++;
            arrList2.add(j);
        }

        Optional<Integer> commonMin = arrList1.stream().filter(arrList2::contains).min(Integer::compare);

        answer[1] = commonMin.orElse(0);




        return answer;
    }

    public static ArrayList<Integer> findDivisors(int number) {
        int sqrt = (int) Math.sqrt(number);
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=1;i<=sqrt;i++){
            if(number % i == 0){
                arrList.add(i);
                if(number/i != i){
                    arrList.add(number/i);
                }
            }
        }
        Collections.sort(arrList);

        return arrList;
    }
    public static int[] changeListToArr(ArrayList<Integer> arrList){
        int answer[] = new int[arrList.size()];
        int size = arrList.size();
        for(int i=0;i<size;i++){
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static int[] allResult(int a){
        return changeListToArr(findDivisors(a));
    }
}
