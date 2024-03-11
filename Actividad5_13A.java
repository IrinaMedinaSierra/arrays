/*
* Modifica la Actividad de aplicación 5.12 para que la función no modifique la tabla que se
*  pasa como parámetro y, en su * lugar, cree y devuelva una copia de la tabla donde se han
*  desordenado los val
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_13A {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[]=crearTabla();
        mostrar("Tabla Original\n"+Arrays.toString(tabla));
        mostrar("Tabla Desordenada\n"+Arrays.toString(desordenarT(tabla)));
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
        Arrays.sort(tabla);
        return tabla;
    }
    //Método que desordena la tabla generada en el metodo anterior.
    // Mediante un bucle de recorrido por toda la tabla.
    // valor1 / valor 2=Random con dos valores multiplicado por la longitud de la tabla
    //variable auxiliar=valor1
    //valor1=valor2
    //valor2=aux;
    public static int[] desordenarT(int tabla[]){
        for (int i = 0; i < tabla.length; i++) {
            int valor1=(int)(Math.random()*tabla.length);
            int valor2=(int)(Math.random()*tabla.length);
            int aux=tabla[valor1];
            tabla[valor1]=tabla[valor2];
            tabla[valor2]=aux;
        }
       int desordenada[]= Arrays.copyOf(tabla,tabla.length);
       return desordenada;
    }

    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }

}
