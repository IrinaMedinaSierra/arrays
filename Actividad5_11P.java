/*
* Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve una tabla
* con todos los índices de los elementos donde se encuentra la clave de búsqueda.
* En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla
* vacía
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_11P {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[]=crearTabla();
        int resultado[]=buscarIndice(tabla);
        mostrarSinLn("El resultado encontrado es: ");
        mostrarSinLn(Arrays.toString(resultado));
    }
    //Método para Crear la tabla y devolver los datos.
    public static int[] crearTabla(){

        mostrarSinLn("Indique el número de elementos a insertar->");
        int longitud=sn.nextInt(); //preguntamos la longitud
        int tabla[]=new int[longitud];//creamos la tabla con la longitud indicada
        for (int i = 0; i < tabla.length; i++) {//recorremos la tabla para insertar los datos
            mostrarSinLn("Indique el elemento " + (i+1)+"->");
            tabla[i]=sn.nextInt();//leemos el dato e insertamos en el indice i
        }
        return tabla;
    }
    //Método que busca en la tabla el valor que se solicita y guarda el resultado en otra tabla.
    public static int[] buscarIndice(int tabla[]){
        //Creamos una tabla donde insertaremos los indices del numero buscado.
        int aux[]=new int[0];
        mostrarSinLn("Indique el número a buscar->");
        int buscar= sn.nextInt(); //leemos el numero a buscar
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==buscar){
                //aumento una posicion al array aux
                aux= Arrays.copyOf(aux,aux.length+1);
                //inserto el indice encontrado
                aux[aux.length-1]=i;
            }
        }
        return aux;
    }



    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }

}
