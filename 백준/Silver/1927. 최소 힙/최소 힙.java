import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        StringBuilder output = new StringBuilder(); 

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            
            if (x == 0) {
                if (minHeap.isEmpty()) {
                    output.append("0\n"); 
                } else {
                    output.append(minHeap.poll()).append("\n"); 
                }
            } else {
                minHeap.offer(x); 
            }
        }
        
        System.out.print(output.toString());
        scanner.close();
    }
}
