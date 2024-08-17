import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}