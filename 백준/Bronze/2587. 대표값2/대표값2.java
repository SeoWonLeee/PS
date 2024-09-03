import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        int average = sum / arr.length;
        
        System.out.println(average);
        System.out.println(arr[arr.length/2]);
    }
}