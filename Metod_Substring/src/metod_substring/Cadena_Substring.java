package metod_substring;

public class Cadena_Substring {

    public static void main(String[] args) {
        /* -----Contar mayusculas, minusculas, espacios, numeros y letras---- */
        String Cadena = "Hola Luis Alfredo Felipe Sic 123";

        /* Variables para concatenar las mayusculas, minusculas, numeros y letras */
        String letras = "";
        String mayus = "";
        String minus = "";
        String numeros = "";

        /* variables para contar cuantas mayusculas, minusculas, espacios, numeros y letras
        existen en la variable tipo string Cadena */
        int n_letras = 0;
        int n_mayus = 0;
        int n_minus = 0;
        int n_numeros = 0;
        int n_espacios = 0;

        /* el ciclo for nos ayuda a recorre el string cadena */
        for (int i = 0; i < Cadena.length(); ++i) {


            /*-- isLetter esta funcion recorre letras --*/
            if (Character.isLetter(Cadena.charAt(i))) {
                n_letras++;
                letras += Cadena.charAt(i);
            }

            /*-- isUpperCase esta funcion devuele el total de mayusculas en la Cadena*/
            if (Character.isUpperCase(Cadena.charAt(i))) {
                n_mayus++;
                mayus += Cadena.charAt(i);
            }

            /*-- isLowerCase esta funcion devuelve el total de minusculas en la Cadena*/
            if (Character.isLowerCase(Cadena.charAt(i))) {
                n_minus++;
                minus += Cadena.charAt(i);
            }

            /*-- isDigit esta funcion devuelve el total de numeros enteros en la Cadena*/
            if (Character.isDigit(Cadena.charAt(i))) {
                n_numeros++;
                numeros += Cadena.charAt(i);
            }

            /*-- IsSpaceChar esta funcion devuelve el total de espacios en la Cadena*/
            if (Character.isSpaceChar(Cadena.charAt(i))) {
                n_espacios++;
                letras += Cadena.charAt(i);
            }

        }
        System.out.println("total de letras + numeros: " + Cadena.length());
        System.out.println("Total de Letras hay: " + n_letras);
        System.out.println("Letras Mayusculas hay: " + n_mayus);
        System.out.println("Letras Minusculas hay: " + n_minus);
        System.out.println("Numeros Hay: " + n_numeros);
        System.out.println("Total de Espacios son:" + n_espacios);

    }

}
