import java.util.Arrays;

public class BusquedaOrdenada {
    public static void main(String[] args) {
     int numeros[]={13,15,18,12,11,16,19,17};
     mostrar("Longitud-> " + numeros.length);
        mostrar("- Sin Ordenar -");
     mostrar(Arrays.toString(numeros));
        Arrays.sort(numeros);
        mostrar("- Ordenado -");
     mostrar(Arrays.toString(numeros));
    //Despues de ordenar el array, se puede buscar un elemento con la clase
        // binarySeach(nombreArray,elementoAbuscar)
        //El resultado de esta clase es un entero, si es positivo, es el indice donde se encuentra
        //Si es negativo menor que 0. es el indice donde deberia ir posicionado ese elemento buscado pero
        //que no se encuentra
        int pos=Arrays.binarySearch(numeros,20);
        mostrar("Posicion->" + pos);
        if (pos<0) {
            mostrar("Este número no existe en la tabla");
            int indiceInsertar = -pos - 1;
            mostrar("El 20 deberia ir en el indice  " + indiceInsertar + " para mantener la tabla ordenada");
        }

    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
}
