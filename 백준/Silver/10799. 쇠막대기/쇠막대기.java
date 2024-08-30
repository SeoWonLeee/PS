import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        Stack<Integer> stack = new Stack<>();
        int pieceCount = 0;  
        int currentOpenBars = 0;  
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == '(') {
                stack.push(i);  
                currentOpenBars++;
            } else {
                stack.pop();  
                
                if (input.charAt(i - 1) == '(') {
                    pieceCount += stack.size(); 
                } else {
                    pieceCount++;
                }
                currentOpenBars--;
            }
        }
        
        System.out.println(pieceCount);
    }
}
