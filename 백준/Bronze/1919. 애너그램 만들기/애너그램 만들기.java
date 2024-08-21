import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i=0; i<word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
        }
        
        for(int j=0; j<word2.length(); j++) {
            freq2[word2.charAt(j) - 'a']++;
        }
        
        int remove = 0;
        for(int k=0; k<26; k++) {
            remove += Math.abs(freq1[k] - freq2[k]);
        }
        
        System.out.println(remove);
    }
}