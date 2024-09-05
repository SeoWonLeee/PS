import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = scanner.nextInt();
        scanner.nextLine();
        
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            
            switch (parts[0]) {
                case "push":
                    queue.add(Integer.parseInt(parts[1]));
                    break;
                    
                case "pop":
                    if (queue.isEmpty()) {
                        output.append(-1).append("\n");
                    } else {
                        output.append(queue.poll()).append("\n");
                    }
                    break;
                    
                case "size":
                    output.append(queue.size()).append("\n");
                    break;
                    
                case "empty":
                    output.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                    
                case "front":
                    if (queue.isEmpty()) {
                        output.append(-1).append("\n");
                    } else {
                        output.append(queue.peek()).append("\n");
                    }
                    break;
                    
                case "back":
                    if (queue.isEmpty()) {
                        output.append(-1).append("\n");
                    } else {
                        output.append(((LinkedList<Integer>) queue).getLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(output.toString());
        scanner.close();
    }
}
