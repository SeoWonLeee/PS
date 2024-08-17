import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(array);
        max = array[array.length-1];
        
        int count[] = new int[max+1];
        for(int i=0; i<array.length; i++) {
            count[array[i]]++;
        }
        
        max = count[0];
        for(int j=1; j<count.length; j++) {
            if(max < count[j]) {
                max = count[j];
                answer = j;
            } else if(max == count[j]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}