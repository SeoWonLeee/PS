import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int P = Integer.parseInt(firstLine[1]);

        Stack<Integer>[] stacks = new Stack[7];
        for (int i = 1; i <= 6; i++) {
            stacks[i] = new Stack<>();
        }

        int totalMovements = 0;

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int stringNumber = Integer.parseInt(line[0]);
            int fretNumber = Integer.parseInt(line[1]);

            Stack<Integer> stack = stacks[stringNumber];

            while (!stack.isEmpty() && stack.peek() > fretNumber) {
                stack.pop();
                totalMovements++;
            }

            if (stack.isEmpty() || stack.peek() < fretNumber) {
                stack.push(fretNumber);
                totalMovements++;
            }
        }

        System.out.println(totalMovements);
    }
}
