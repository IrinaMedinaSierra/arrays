import java.util.Scanner;
/*
* Solicitar al usuario el numero de elementos y luego mostar de forma inversa  los números
* insertados
* */
public class Actividad5_3R {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        mostrarSinLn("Indique el número de elementos enteros a insertar->");
        int longitud=sn.nextInt();
        int numeros[]=new int[longitud];
        for (int i = 0; i < longitud; i++) {
            mostrarSinLn("Indique el número->");
            numeros[i]=sn.nextInt();
        }
        //Vamos a mostrar de forma inversa
        mostrar("Muestra de forma inversa los números insertados");
        mostrar("···············································");
        for (int i = numeros.length-1; i >=0 ; i--) {
            mostrar("->" +numeros[i] );

        }
    }
    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
}
