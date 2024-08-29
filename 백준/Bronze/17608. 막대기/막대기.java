import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[] heights = new int[N];
        
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }
        
        int maxSeenHeight = 0;
        int visibleCount = 0;
        
        for (int i = N - 1; i >= 0; i--) {
            if (heights[i] > maxSeenHeight) {
                visibleCount++;
                maxSeenHeight = heights[i];
            }
        }
        
        System.out.println(visibleCount);
    }
}
