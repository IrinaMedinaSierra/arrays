import java.util.Arrays;
import java.util.Scanner;
public class Actividad5_7R {
    public static void main(String[] args) {
        int tabla[]=crearArray();
        mostrar(Arrays.toString(tabla));
        buscarDuplicados(tabla);
    }
    public static int[] crearArray(){
        Scanner sn=new Scanner(System.in);
        mostrarSinLn("Indique la longitud de la tabla->");
        int longitud= sn.nextInt();
        int tabla[]=new int[longitud];
        for (int i = 0; i < longitud; i++) {
            tabla[i]=(int)(Math.random()*20+1);
        }
        return  tabla;
    }
    public static void buscarDuplicados(int tabla[]){
        int duplicados[]=new int[0];//creo una nueva tabla para almacenar los numeros sin duplicados
        for (int i = 0; i < tabla.length; i++) {
            if(!buscar(duplicados,tabla[i])){
                duplicados= Arrays.copyOf(duplicados,duplicados.length+1);
                duplicados[duplicados.length-1]=tabla[i];
            }
        }
        mostrar(Arrays.toString(duplicados));
    }
    public static boolean buscar(int tabla[],int numero){
        boolean existe=false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==numero)
                existe=true;
        }
        return existe;
    }


    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }

}
