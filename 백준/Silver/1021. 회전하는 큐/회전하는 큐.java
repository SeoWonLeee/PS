import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        
        int[] positions = new int[M];
        for (int i = 0; i < M; i++) {
            positions[i] = sc.nextInt();
        }
        
        int totalOperations = 0;
        
        for (int pos : positions) {
            int index = ((LinkedList<Integer>) deque).indexOf(pos);
            int size = deque.size();
            
            int leftDistance = index;
            int rightDistance = size - index;
            
            if (leftDistance <= rightDistance) {
                totalOperations += leftDistance;
                for (int i = 0; i < leftDistance; i++) {
                    deque.addLast(deque.removeFirst());
                }
            } else {
                totalOperations += rightDistance;
                for (int i = 0; i < rightDistance; i++) {
                    deque.addFirst(deque.removeLast());
                }
            }
            
            deque.removeFirst();
        }
        
        System.out.println(totalOperations);
    }
}
