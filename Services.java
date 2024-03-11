public class Services {

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
    public static void buscarTexto(String texto[],String buscar){
        int indice=0;
        while (indice<texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        if (indice<texto.length)
            mostrar("La posicion del nombre buscado es->"+indice);
        else
            mostrar("El nombre buscado no esta en la tabla");
    }
}
