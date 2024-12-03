package trabajoenfoqueentorno;
import java.util.Scanner;

public class TrabajoEnfoqueEntorno {
    public static void main(String[] args) {
// 1. Introducir 10 números sin decimales por teclado. Mostrar de < por pantalla. 3. Decir cuantos son pares y cuantos son impares.
        
        // Creamos un array para 10 elementos.
        int[] num = new int[10];

        // Eliminación de instancias innecesarias, dejando así solo una.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numbers: ");

        // El for recorre el array pidiendo una entrada en cada vuelta.
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        // Invoca el método para ordenar las entradas pedidas al usuario.
        bubbleSort(num);

        System.out.print("Ordered numbers: ");
        // Imprime en pantalla el array ya ordenado.
        for (int i : num) {
            System.out.print(i + " ");
        }
        
        int evenNumbers = 0, oddNumbers = 0;

        // Comprobamos si el numero es par añadiendo +1 a evenNumbers y si no, añadimos +1 a oddNumbers
        for (int i : num) {
            if (i % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("");
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static void bubbleSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int auxtemp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = auxtemp;
                }
            }
        }
    }
}
