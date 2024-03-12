import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Actividad5_15A {
    static Scanner sn=new Scanner(System.in);
    static int notas[][]=new int [3][5];
    public static void main(String[] args) {

        altaNotas();

    }
    //Metodo para insertar notas
    public static void altaNotas(){
        //Solicitamos los Trimestres y las notas
        for (int trimestre=0;trimestre<3;trimestre++){
            mostrar("Notas del trimestre "+(trimestre+1)+"->");
            leerNotas(notas,trimestre);
        }
        //Despues de leer notas, nos piden la media por trimestre
        double media[]=new double[3];
        for (int alum = 0; alum <5 ; alum++) {
            for (int trim = 0; trim <3 ; trim++) {
                media[trim] += notas[trim][alum];
            }
        }

        mostrar("La media del Primer trimestre = " + (media[0]/5));
        mostrar("La media del Segundo trimestre = " + (media[1]/5));
        mostrar("La media del Tercero trimestre = " + (media[2]/5));
        mediaAlumno();
    }

    //Método para leer las notas
    public static void leerNotas(int notas[][],int trimestre){
        for (int i = 0; i <notas[trimestre].length ; i++) {
            mostrarSinLn("Alumno ("+(i+1)+")");
            notas[trimestre][i]=sn.nextInt();
        }
        //mostrar(Arrays.deepToString(notas));

    }
    //Calcular la media de un alumno que el usuario indique
    public static void mediaAlumno(){
        mostrarSinLn("Indique la posición del alumno");
        int pos=sn.nextInt();
        double mediaA=(notas[0][pos-1]+notas[1][pos-1]+notas[2][pos-1])/3.0;
        mostrarSinLn("La media del alumno " + pos + " es -> ");
        System.out.printf("%.2f",mediaA);
    }

    //Metodos de salida
    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }
}
