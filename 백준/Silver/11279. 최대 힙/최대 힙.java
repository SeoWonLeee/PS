import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        StringBuilder output = new StringBuilder(); 

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            
            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    output.append("0\n"); 
                } else {
                    output.append(maxHeap.poll()).append("\n"); 
                }
            } else {
                maxHeap.offer(x); 
            }
        }
        
        System.out.print(output.toString());  
        scanner.close();
    }
}
