package fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaDaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            numeros.add(numero);
            soma += numero;
        }

        System.out.println("Lista: " + numeros);
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}