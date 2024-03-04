import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tres elementos fundamentales para crer los arrays
        // nombre de la variable
        // longitud
        // tipo de datos
        int[] edad=new int[5];
        edad[0]=14;
        edad[1]=24;
        edad[2]=34;
        edad[3]=44;
        edad[4]=54;
        System.out.println(Arrays.toString(edad));
        //Ejemplo, solicitar con Scanner las edades..
        //Solicitar 1º cuantas edades voy a insertar...
        Scanner sn=new Scanner(System.in);
        mostrar("Indique el número de edades a insertar");
        int longitud= sn.nextInt();//se guarda la longitud con que voy a crear el array
        byte[] edades=new byte[longitud]; //crearmos el array con la longitud leida
        //necesitamos preguntar las edades, para ello vamos a crear un  bucle for sencillo para
        //que recorra las posiciones del array e inserte los valores
        // utilizamos la variable longitud para saber donde debe para el bucle
        for(int i=0;i<longitud;i++){
            mostrar("Indique la Edad Nº " + (i+1));
            edades[i]=sn.nextByte();
        }
       // System.out.println(Arrays.toString(edades));
        //bucle foreach  : bucle para recorrer tablas
        for (int ed:edades){ //se declara una variable llamada elemento y que recorre el array
            System.out.println("Edad insertada->"+ed);
        }
        //Metodos de la API de Java sobre los arrays
        // Conocer la longitud de un array
        mostrar("Longitud del array Edad->" + edad.length);
        mostrar("Longitud del array Edades->" + edades.length);
        for(int i=0;i<edad.length;i++){
            mostrar("La edad insertada en la posicion " + (i+1)+ " es->"+ edad[i]);
        }

        //Referencias en los arrays, variables, etc
        mostrar("************REFERENCIAS DE MEMORIA**********************");
        System.out.println(edad);
        System.out.println(edades);



    }
    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
}
