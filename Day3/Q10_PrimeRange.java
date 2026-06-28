import java.util.Scanner;

public class Q10_PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int num = start; num <= end; num++) {

            if(num < 2)
                continue;

            boolean prime = true;

            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime)
                System.out.print(num + " ");
        }
    }
}