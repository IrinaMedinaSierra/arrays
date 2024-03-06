import java.util.Scanner;

/*Vamos a realizar la cesta de la compra..
* Cada vez que compramos, variamos de productos, y de cantidad.
* Creamos un array que crecera a medida que insertemos productos,
* para ello utilizaremos un pequeño
* menu, y para la ejecución funciones de busqueda y de insersion.
*
*/
public class InsertarOrdenadaFunciones {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
    menu();
    }

    public static void menu(){
        mostrar("----CESTA DE LA COMPRA ----");
        mostrar("1. Insertar");
        mostrar("2. Mostrar Cesta");
        mostrar("3. Eliminar Producto");
        mostrar("4. Imprimir y salir");
        mostrarSinLn("Indica su opcion-> ");
        int opcion=sn.nextInt();
        String cesta[]=new String[0];
        switch (opcion){
            case 1->cesta=insertar(cesta);
        }
    }

    public static String[] insertar(String cesta[]){
        //pregunto el producto a insertar
        mostrarSinLn("Indica el nombre del producto->");
        String produtoNuevo=sn.nextLine();
        //Lo buscamos, si esta, enviamos un mensaje sino, lo insertamos....
        boolean existe= buscarProducto(cesta,produtoNuevo);
        // lo insertas

        //lo devolvemos a la funcion menu.
        return cesta;
    }
    /************/
    public static boolean buscarProducto(String cesta[],String productoNuevo){
        boolean existe=false; //creamos un booleanos que controle si existe
        int indice=0;
        while (indice<cesta.length && !cesta[indice].equals(productoNuevo)){
            indice++;
        }
        if (indice<cesta.length)
            existe=true;
        return existe;
    }
    /****************/

    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }


}

