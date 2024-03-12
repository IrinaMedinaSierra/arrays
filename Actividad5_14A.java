import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_14A {
    public static void main(String[] args) {
        double sueldos[]=altaSueldos();
        //llamos al metodo mostrar decreciente
        mostrarDecreciente(sueldos);
        mostrarMaxMin(sueldos);
        mediaSueldos(sueldos);
    }

    //Método de insertar los sueldo
    public static double[] altaSueldos(){
        double sueldos[]=new double[0];
        double sueldoAux=0;
        Scanner sn=new Scanner(System.in);
        //el bucle While que hasta que no se escriba -1 no salga del bucle.
       do{
            mostrarSinLn("Indique el sueldo-> ");
            sueldoAux=sn.nextDouble();
            if (sueldoAux!=-1) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[sueldos.length - 1] = sueldoAux;
            }
        } while (sueldoAux!=-1);
        //enviamos el resultado
        Arrays.sort(sueldos);
        return sueldos;
    }

    //Metodo para mostrar decreciente
    public static void mostrarDecreciente(double sueldos[]){
        for (int i = sueldos.length-1; i >=0 ; i--) {
            mostrarSinLn(""+sueldos[i]+"-");
        }
    }

    //Metodo para indicar max y min de una tabla ordenada
    public static void mostrarMaxMin(double sueldos[]){
        mostrar("\nSueldo mayor ->" + (sueldos[sueldos.length-1]));
        mostrar("Sueldo menor ->"+ sueldos[0]);
    }

    //Método para calcular la media
    public static void mediaSueldos(double sueldos[]){
        double suma=0;
        for (int i = 0; i < sueldos.length ; i++) {
            suma+=sueldos[i];
        }
        double media=suma/sueldos.length;
        mostrar("La media de los sueldos es -> " + media + "€");
    }


    /*Métodos de impresión en pantalla*/
    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }
}
