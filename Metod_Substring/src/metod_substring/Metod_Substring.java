package metod_substring;

public class Metod_Substring {

    public static void main(String[] args) {
        String texto = "Java es mi mejor lenguaje de programacion";
        System.out.println(texto);

        /* Obtener la cadena Java*/
        String cadena = texto.substring(0, 4);
        System.out.println(cadena);
        /* Obtener el total de caracteres de la  cadena Java*/
        System.out.println(cadena.length());
        System.out.println();

        /* Obtener la cadena programacion*/
        String lenguaje = texto.substring(29);
        System.out.println(lenguaje);
        /* Obtener el total de letras de la cadena programacion*/
        System.out.println("total de caracteres es: " + lenguaje.length());
        System.out.println();

        /* Obtener la cadena programacion INDEXOF nos permite definir un caracter
        en especifico*/
        lenguaje = texto.substring(texto.indexOf("p"));
        System.out.println(lenguaje);

        /* Obtener el total de letras de la cadena programacion*/
        System.out.println("total de caracteres es: " + lenguaje.length());
        System.out.println();

        /* Nota: si hubiera mas de una letra "P" se puede ser mas especifico
        ejemplo se podria utilizar "PR" o "PRO "*/
    }

}
