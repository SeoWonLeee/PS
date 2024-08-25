import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();
        int[] weights = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        
        sc.close();
        
        System.out.println(calculateCrossingTime(n, w, L, weights));
    }

    public static int calculateCrossingTime(int n, int w, int L, int[] weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        
        for (int i = 0; i < n; i++) {
            while (true) {
                if (bridge.size() == w) {
                    currentWeight -= bridge.poll();
                }
                
                if (currentWeight + weights[i] <= L) {
                    bridge.add(weights[i]);
                    currentWeight += weights[i];
                    break;
                } else {
                    bridge.add(0);
                    time++;
                }
            }
            
            time++; 
        }
        
        time += w;
        
        return time;
    }
}
