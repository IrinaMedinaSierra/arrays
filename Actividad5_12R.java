/*
Crer una tabla de 5x5 donde el elemento de la posicion [i][j]=10*i+j
Luego mostrarla de forma ordenada.
 */

import java.util.Arrays;

public class Actividad5_12R {
    public static void main(String[] args) {
        mostrar(Arrays.deepToString(operacion()));

    }

    public static int[][] operacion(){
        int num[][]=new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                num[i][j]=10*i+j;
            }

        }
        mostrarTabla(num);
        return num;
    }
    //forma de recorrer un Array bidimensional con un foreach.
    public static void mostrarTabla(int num[][]){
        for (int fila[]:num){
            for (int col:fila){
                mostrarSinLn(col + " ");
            }
            mostrar("");
        }
    }

   public static void mostrar(String texto) {
           System.out.println("\t" + texto);
   }

   public static void mostrarSinLn(String texto) {
           System.out.print("\t" + texto);
   }


}
