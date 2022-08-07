// Pablo Vinicius

import java.util.Arrays;

public class Testador {
    public static void main(String[] args) {
        
        System.out.println("Testando o método contem()");
        for (int i = 0; i < 5; i++) {
            int[] array1, array2;
            int n;
            int len = (int) (Math.random() * 10 + 1);
            array1 = new int[len];
            array2 = new int[len];

            n = (int) (Math.random() * 10);
            
            for (int j = 0; j < len; j++) {
                array1[j] = (int) (Math.random() * 10);
                array2[j] = (int) (Math.random() * 10);
            }

            System.out.printf("Array 1: %s\n", Arrays.toString(array1));
            System.out.printf("Array 2: %s\n", Arrays.toString(array2));
            System.out.printf("n: %d\n", n);
            System.out.printf("Retorno: %s\n\n", MeusArrays.contem(array1, array2, n));
        }

        System.out.println("\nTestando o método numerosAleatorios()");
        for (int i = 0; i < 5; i++) {
            System.out.printf("n: %d\n", i);
            System.out.printf("Retorno: %s\n\n", Arrays.toString(MeusArrays.numerosAleatorios(i)));
        }
    }
}
