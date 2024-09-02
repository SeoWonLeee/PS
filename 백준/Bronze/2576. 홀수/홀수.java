import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
            
            if(arr[i] % 2 != 0) {
                sum += arr[i];
                
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        
        if(sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }
}