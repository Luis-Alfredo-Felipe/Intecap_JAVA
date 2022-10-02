/*
 * Crear un tablero con arreglos en el cual se ordenen en forma zig zag de mayor a menor
 * Utilizar arreglos bidimensionales
 */
public class ArrayMulti {

    public static void main(String[] args) {
        int n1[][] = new int[8][8];
        int iterador = 64;

        for (int i = 0; i < n1.length; i++) {

            if (i % 2 != 0) {
                for (int j = 0; j < n1[i].length; j++) {
                    n1[i][j] = iterador;
                    iterador--;
                }

            } else {
                for (int j = n1[i].length - 1; j >= 0; j--) {
                    n1[i][j] = iterador;
                    iterador--;
                }
            }

        }

        for (int[] n11 : n1) {
            for (int j = 0; j < n11.length; j++) {
                System.out.print(n11[j] + "\t");
            }
            System.out.println("\n");
        }
    }

}
