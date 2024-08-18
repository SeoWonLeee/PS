class Solution {
    public String solution(int age) {
        String answer = "";
        String s = Integer.toString(age);
        
        for(int i=0; i<s.length(); i++) {
            answer += (char)((char)s.charAt(i) + 49);
        }
        
        return answer;
    }
}