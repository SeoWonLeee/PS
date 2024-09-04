import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int num;
        int Y = 0;
        int M = 0;
        
        for(int i=0; i<N; i++) {
            num = scanner.nextInt();
            
            Y += ((num/30)+1)*10;
            M += ((num/60)+1)*15;
        }
        
        if(Y < M) {
            System.out.println("Y " + Y);
        } else if(Y > M) {
            System.out.println("M " + M);
        } else if(Y == M) {
            System.out.println("Y M " + Y);
        }
    }
}