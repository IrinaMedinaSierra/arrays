import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        //Ordenar un Array, se modifica el array...
        //Se ordena de forma creciente
        //Los datos pueden ser primitivos (numericos)
        int[] numeros={5,8,7,1,3,9,15};
        //La funcion para ordenar es Arrays.sort(nombreDelArray)
        Arrays.sort(numeros);// El array se modifica y se ordena
        System.out.println(Arrays.toString(numeros));
        // Ordenar tipos no primitivos (String)
        String nombres[]={"Maria","Ana","Xiomara","Beatriz","arancha"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
    }



}
