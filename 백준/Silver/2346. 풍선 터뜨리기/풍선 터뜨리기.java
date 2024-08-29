import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] balloons = new int[N];
        for (int i = 0; i < N; i++) {
            balloons[i] = scanner.nextInt();
        }
        scanner.close();
        
        ArrayList<Integer> balloonList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            balloonList.add(i);
        }
        
        List<Integer> burstOrder = new ArrayList<>();
        int currentIndex = 0;  

        while (!balloonList.isEmpty()) {
            int index = balloonList.get(currentIndex);
            burstOrder.add(index + 1);  
            balloonList.remove(currentIndex);  

            int move = balloons[index];
            if (balloonList.isEmpty()) break;  

            if (balloonList.size() > 0) {
                if (move > 0) {
                    currentIndex = (currentIndex + move - 1) % balloonList.size();
                } else {
                    currentIndex = (currentIndex + move) % balloonList.size();
                    if (currentIndex < 0) {
                        currentIndex += balloonList.size();
                    }
                }
            }
        }
        
        System.out.println(String.join(" ", burstOrder.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
