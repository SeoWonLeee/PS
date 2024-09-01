import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequence = new int[n];
        
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int currentNumber = 1;

        for (int number : sequence) {
            while (currentNumber <= number) {
                stack.push(currentNumber++);
                result.append("+\n");
            }

            if (stack.peek() == number) {
                stack.pop();
                result.append("-\n");
            } else {
                result.setLength(0);
                result.append("NO");
                break;
            }
        }

        System.out.print(result.toString());
    }
}
