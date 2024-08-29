import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();

            switch (command) {
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;

                default:
                    String[] parts = command.split(" ");
                    int value = Integer.parseInt(parts[1]);
                    stack.push(value);
                    break;
            }
        }

        scanner.close();
    }
}
