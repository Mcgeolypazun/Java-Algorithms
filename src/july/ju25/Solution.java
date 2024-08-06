package july.ju25;

import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        System.out.println("BBBASDF".indexOf("ASDF"));
        System.out.println("ASDF".indexOf("ASD"));
        System.out.println("ASDF".indexOf("A"));


        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] sk = new String[]{"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(T.solution("CBD",sk));
    }
}
