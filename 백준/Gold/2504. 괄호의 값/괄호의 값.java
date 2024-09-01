import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println(calculateBracketValue(input));
    }

    private static int calculateBracketValue(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentValue = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(currentValue);
                stack.push(c == '(' ? -2 : -3);
                currentValue = 0;
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return 0; 
                }
                int multiplier = stack.pop();
                int previousValue = stack.pop();
                
                if ((c == ')' && multiplier != -2) || (c == ']' && multiplier != -3)) {
                    return 0; 
                }

                currentValue = (currentValue == 0 ? 1 : currentValue) * -multiplier + previousValue;
            }
        }

        return stack.isEmpty() ? currentValue : 0;
    }
}
