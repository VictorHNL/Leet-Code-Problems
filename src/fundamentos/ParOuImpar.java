package fundamentos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é par");
        } else {
            System.out.println(number + " é impar");
        }

        scanner.close();
    }
}