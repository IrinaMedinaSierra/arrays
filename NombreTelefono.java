import java.util.Scanner;
/*
* Insertar 10 nombre y numeros de teléfonos y luego mostrarlos
* */
public class NombreTelefono {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String[] nombre=new String[3];
        int[] telefono=new int[3];
        for (int i=0;i<nombre.length;i++){
            mostrarSinLn("Indica el Nombre Nº " + (i+1)+" ");
            nombre[i]=sn.next();sn.nextLine();
            mostrarSinLn("Indica el Teléfono Nº " + (i+1)+" ");
            telefono[i]=sn.nextInt();
        }
        /*Mostrar los Nombres y números insertados*/
            mostrarerr("-----------------------------");
            mostrar("Lista de teléfonos");
            mostrar("Nombre\tTeléfono");
        for (int i=0;i<nombre.length;i++) {
            mostrar(nombre[i]+ "\t"+telefono[i]);
            mostrar("-----------------------------");
        }
        mostrarSinLn("¿Quieres buscar un nombre y te indique el numero->");
        String nombreBuscar=sn.next();sn.nextLine();
        // envio el nombre  la funcion buscar nombre y recibo el indice donde esta ubicado, luego
        //muestro el número del indice recibido
        int indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero<nombre.length){
            mostrar("**** E N C O N T R A D O ****");
            mostrar(nombre[indiceNumero] + "-> Teléfono-> " + telefono[indiceNumero]);
        }       else
            mostrar("No se encuentra "+ nombreBuscar + " en la tabla actual.");

        mostrar("¿Quieres cambiar algún número telefoónico? Dime de quien->");
        nombreBuscar=sn.next();sn.nextLine();
        indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero<nombre.length) {
            mostrar("Indica el nuevo número de teléfono");
            telefono[indiceNumero]=sn.nextInt();
        }
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn(String texto){
        System.out.print("\t"+texto);
    }
    public static void mostrarerr(String texto){
        System.err.println("\t"+texto);
    }
    public static int buscarTexto(String texto[],String buscar){
        int indice=0;
        while (indice<texto.length && !texto[indice].equals(buscar)){
            indice++;
        }
        return indice;
    }
}
