import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < m) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}