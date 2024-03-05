import java.awt.*;
import java.util.Arrays;

public class copiarArray {
    public static void main(String[] args) {
        //Copiar un array, crear dos arrays con la misma longitud.
        int arrayUno[]=new int[5];
        for (int i = 0; i <arrayUno.length ; i++) {
            arrayUno[i]=(int)(Math.random()*100+1);
        }
        mostrar (Arrays.toString(arrayUno));
        //si necesitas copiar un array
        int arrayDos[]= new int[5];
        //**** copyOf ****
        // construye y devuelve una copia del origen al destino con la longitud indicada en el metodo
        arrayDos=Arrays.copyOf(arrayUno,arrayUno.length);
        mostrar(Arrays.toString(arrayDos));
        //copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el rango
        //indice desde, donde comienza
        //hasta..donce termina sin incluir este elemento.
        int array3[]=Arrays.copyOfRange(arrayUno,2,4);
        mostrar(Arrays.toString(array3));
        //Copiar con un metodo de la clase System -> insertar o borrar elementos en una tabla.
        int array4[]=new int[5];
        System.arraycopy(arrayUno,0,array4,0,arrayUno.length);
        mostrar(Arrays.toString(array4));
    }

     public static void mostrar(String texto) {
             System.out.println("\t" + texto);
         }

         public static void mostrarSinLn(String texto) {
             System.out.print("\t" + texto);
         }
}
