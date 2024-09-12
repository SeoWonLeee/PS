import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeA = scanner.nextInt();
        int sizeB = scanner.nextInt();
        scanner.nextLine();  

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        String[] aElements = scanner.nextLine().split(" ");
        for (String elem : aElements) {
            setA.add(Integer.parseInt(elem));
        }

        String[] bElements = scanner.nextLine().split(" ");
        for (String elem : bElements) {
            setB.add(Integer.parseInt(elem));
        }

        Set<Integer> symmetricDifference = new HashSet<>(setA);
        symmetricDifference.addAll(setB);
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        symmetricDifference.removeAll(intersection);

        System.out.println(symmetricDifference.size());
        
        scanner.close();
    }
}
