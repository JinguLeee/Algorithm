import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N/5; i >= 0; i--) {
            int num = N - i * 5;
            if (num % 3 == 0) {
                System.out.println(i + num/3);
                return;
            }
        }
        System.out.println(-1);
    }
}