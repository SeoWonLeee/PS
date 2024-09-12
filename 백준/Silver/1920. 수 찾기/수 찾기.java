import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        Set<Integer> numberSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            numberSet.add(scanner.nextInt());
        }
        
        int M = scanner.nextInt();
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (numberSet.contains(scanner.nextInt())) {
                output.append("1\n");
            } else {
                output.append("0\n");
            }
        }
        
        System.out.print(output.toString());
        scanner.close();
    }
}
