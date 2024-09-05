import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        while (t-- > 0) {
            int n = scanner.nextInt();  
            int m = scanner.nextInt();  

            Queue<Paper> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int priority = scanner.nextInt();
                queue.add(new Paper(i, priority));
            }

            int printOrder = 0;
            while (!queue.isEmpty()) {
                Paper current = queue.poll();
                boolean hasHigherPriority = false;
                for (Paper paper : queue) {
                    if (paper.priority > current.priority) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.add(current);
                } else {
                    printOrder++;
                    if (current.index == m) {
                        System.out.println(printOrder);
                        break;
                    }
                }
            }
        }
        scanner.close();
    }

    static class Paper {
        int index;
        int priority;

        Paper(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
