/*
* Solicitar al usuario que genere una tabla de 5x5
*
* */
import java.util.Arrays;
import java.util.Scanner;
public class ArraysBidimensionales {
    public static void main(String[] args) {
        // solicito que muestre el resultado de la funcion
        mostrar(Arrays.deepToString(solicitarNum()));
    }
    public static int[][] solicitarNum(){
        Scanner sn=new Scanner(System.in);
        int numeros[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mostrarSinLn("Ingrese el número de la fila " + i +" y la columna " + j + " ->");
                numeros[i][j]=sn.nextInt();
            }
        }
         return numeros;
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }


}
