/*
* rellenar una tabla con numeros aleatorios en el rango de 2 hasta fin, retornando la tabla ordenada
* */

import java.util.Arrays;
import java.util.Scanner;
public class Actividad5_5R {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        mostrarSinLn("Indica la longitud de la tabla->");
        int longitud=sn.nextInt();
        mostrarSinLn("Indica el número fin de los números aleatorios");
        int fin=sn.nextInt();
        int pares[]=new int[longitud];
        for (int i = 0; i < pares.length ; i++) {
            int num=(int) (Math.random()*fin+1);
            if (num%2==0){
                pares[i]=num;
            }else{
                --i;
            }
        }
        Arrays.sort(pares);
        mostrar("Tabla Ordenada->" + Arrays.toString(pares));
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
}
