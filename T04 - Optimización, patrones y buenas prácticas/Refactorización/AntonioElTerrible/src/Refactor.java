import java.util.Arrays;
import java.util.Scanner;

public class Refactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        System.out.println("Introduce 10 números:");
        // Rellenar array y contar pares sobre la marcha
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
        }

        // Ordenar automáticamente
        Arrays.sort(numeros);

        // Mostrar resultados
        System.out.println("Ordenados: " + Arrays.toString(numeros));
        System.out.println("Pares: " + pares + ", Impares: " + (10 - pares));
    }
}