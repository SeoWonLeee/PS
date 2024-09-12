import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        Set<String> unheardSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            unheardSet.add(scanner.next());
        }
        
        Set<String> unheardAndUnseen = new TreeSet<>();
        
        for (int i = 0; i < M; i++) {
            String name = scanner.next();
            if (unheardSet.contains(name)) {
                unheardAndUnseen.add(name);
            }
        }
        
        System.out.println(unheardAndUnseen.size());
        for (String name : unheardAndUnseen) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
