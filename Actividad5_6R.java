import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
* Solicitar la apuesta  a la primitiva y verificar si existen en la combinación Ganadora
*
* */
public class Actividad5_6R {
    public static void main(String[] args) {
        int combinacionGanadora[] = new int[6];
        int numero;

        for (int i = 0; i < 6; i++) {
            numero= (int) (Math.random() * 49 + 1);
            //si el random duplica un numero en la primitiva eso se da, por lo que hay que validar!
            //hay que hacer una busqueda en el array
             //declaramos el índice en 0 para que comience desde ese punto el recorrido del bucle
            int indice=0;
            while (indice<combinacionGanadora.length && combinacionGanadora[indice]!=numero){
                indice++;// se incrementa el índice para ir recorriendo las posiciones del array
            }
            if (indice>=combinacionGanadora.length){
                combinacionGanadora[i]=numero;
            }else{
                i--;
            }
        }
        Scanner sn=new Scanner(System.in);
        mostrar("- Indica tu apuesta -");
        int apuesta[]=new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrarSinLn("Número "+ (i+1)+"->");
            apuesta[i]=sn.nextInt();
        }
        mostrar("Tu apuesta es -> "+Arrays.toString(apuesta));
        mostrar("Número de Aciertos en tu Apuesta->" + primitiva(apuesta,combinacionGanadora));
        mostrar("La combinación ganadora es -> "+Arrays.toString(combinacionGanadora));
    }
    public static int primitiva(int apuesta[],int ganadora[]){
        int aciertos=0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for(int ele:apuesta){
            //como la tabla ganadora esta ordenada utilizamos el binarySearch
            if (Arrays.binarySearch(ganadora,ele)>=0){
                aciertos++; //hemos acertado ese numero
            }
        }
        return (aciertos);
    }

    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}
