import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k[] = new int[n];
        
        for(int i=0; i<k.length; i++) {
            k[i] = scanner.nextInt();
        }
        
        for(int j=0; j<k.length; j++) {
            if(k[j] < m) {
                System.out.print(k[j] + " ");
            }
        }
    }
}