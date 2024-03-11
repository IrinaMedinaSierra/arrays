import java.util.Scanner;

public class ArraysAlumnos {
    public static void main(String[] args) {

        mostrarAlumnos(alumnosDatos());
    }

    /* FUNCION PARA LEER LOS DATOS DE LOS ALUMNOS Y LO GUARDARMOS EN EL ARRAY*/
    public static String[][] alumnosDatos(){
        String alumnos [][]=new String[13][4];
        Scanner sn=new Scanner(System.in);
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
               //si es la columna 0-> Nombre
                if (j==0) {
                    mostrarSinLn("Indica el nombre del alumno "+(i+1)+"->");
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                //si es la columna 1-> Apellido
                if (j==1) {
                    mostrarSinLn("Indica el Apellido del alumno "+(i+1)+"->");
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                if (j==2) {
                    //si es la columna 2 -> Profesión
                    mostrarSinLn("Indica la profesión del alumno "+(i+1)+"->");
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
                //si es la columna 3-> Email
                if (j==3) {
                    //si es la columna 2 -> Profesión
                    mostrarSinLn("Indica el email del alumno "+(i+1)+"->");
                    alumnos[i][j] = sn.next();
                    sn.nextLine();
                }
            }
        }

        return alumnos;
    }
    /*
    FUNCION QUE MUESTRA LA INFORMACIÓN ORDENADA POR EL NOMBRE DE LOS ALUMNOS Y EN FORMA DE TABLA
    (foreach)
    */
    public static void mostrarAlumnos(String alumnos[][]){


    }
    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }

}
