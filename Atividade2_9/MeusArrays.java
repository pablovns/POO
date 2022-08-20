// Pablo Vinicius

public class MeusArrays {
    public static int contem(int[] arr1, int[] arr2, int n) {
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            if (n == arr1[i]) {
                count++;
                break; // pra não contar mais de uma vez por array
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (n == arr2[i]) {
                count++;
                break; // pra não contar mais de uma vez por array
            }
        }

        switch (count) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
        }

        // caso algo dê errado, retorna -1
        return -1;
    }

    public static int[] numerosAleatorios(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }
}
