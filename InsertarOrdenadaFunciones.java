import java.util.Arrays;
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
    static String cesta[]=new String[0];
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
        switch (opcion){
            case 1-> {
                cesta = insertar(cesta);
                menu();
            }
            case 2->{
                mostrar(Arrays.toString(cesta));
                menu();
            }
            case 3->{
                cesta=eliminar(cesta);
                menu();
            }
        }

    }

    public static String[] insertar(String cesta[]){
        //pregunto el producto a insertar
        mostrarSinLn("Indica el nombre del producto->");
        String produtoNuevo=sn.next();sn.nextLine();
        //Lo buscamos, si esta, enviamos un mensaje sino, lo insertamos....
        boolean existe= buscarProducto(cesta,produtoNuevo);
        if (existe){
            mostrar("El producto que indicas ya existe");
        }else {   // lo insertas
            cesta=Arrays.copyOf(cesta,cesta.length+1);
            cesta[cesta.length-1]=produtoNuevo;//en el ultimo indice, inserta el nuevo valor.
        }
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
    public static String[] eliminar(String cesta[]){
        mostrarSinLn("Indica el nombre del producto a eliminar->");
        String productoElimnar=sn.next();sn.nextLine();
        int indice=0;
        for (int i = 0; i <cesta.length ; i++) {
            if (cesta[i].equals(productoElimnar)){
                indice=i;
            }
        }
        boolean existe=buscarProducto(cesta,productoElimnar);
        if(!existe){
            mostrar("El producto que quieres borrar no existe en la Cesta");
        }else{
            cesta[indice]=cesta[cesta.length-1];
            cesta=Arrays.copyOf(cesta,cesta.length-1);
        }
        return cesta;
    }

    /***************************/
    public static void mostrar(String texto) {
            System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
            System.out.print("\t" + texto);
    }


}

