import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else if (sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is a Deficient Number.");
        }
    }
}
