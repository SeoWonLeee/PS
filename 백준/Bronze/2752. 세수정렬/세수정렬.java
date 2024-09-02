import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[3];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}