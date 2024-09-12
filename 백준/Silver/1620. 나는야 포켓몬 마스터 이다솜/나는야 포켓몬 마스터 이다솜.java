import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  
        int M = scanner.nextInt();  
        scanner.nextLine();  

        HashMap<String, Integer> nameToNumber = new HashMap<>();
        HashMap<Integer, String> numberToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = scanner.nextLine();
            nameToNumber.put(name, i);
            numberToName.put(i, name);
        }

        for (int i = 0; i < M; i++) {
            String query = scanner.nextLine();
            if (query.matches("\\d+")) {  
                int number = Integer.parseInt(query);
                System.out.println(numberToName.get(number));
            } else {  
                System.out.println(nameToNumber.get(query));
            }
        }

        scanner.close();
    }
}
