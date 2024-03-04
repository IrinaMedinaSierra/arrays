import java.util.Scanner;

/*
Solicitar un número, realizar la media de los números insertados, la media de los negativos  y
la cuenta de los números de 0 introducidos.
*/
public class Actividad5_3P {
    public static void main(String[] args) {
        //solicitar cuantos números a insertar
        Scanner sn=new Scanner(System.in);
        mostrar("Indica el número de elementos a insertar->");
        int longitud=sn.nextInt();
        int numeros[]=new int[longitud];
        int contadorCeros=0;
        int contadorNegativos=0;
        int contadorPositivos=0;
        double mediaPositivos=0;
        double mediaNegativos=0;
        for (int i = 0; i <longitud ; i++) {
              mostrar("Indica el elemento Nº" + (i+1));
              numeros[i]=sn.nextInt();
              if (numeros[i]<0){
                  mediaNegativos+=numeros[i];
                  contadorNegativos++;
              }else if (numeros[i]>0){
                  mediaPositivos+=numeros[i];
                  contadorPositivos++;
              }else{
                  contadorCeros++;
              }
        }
        mediaNegativos/=contadorNegativos;
        mediaPositivos/=contadorPositivos;
        mostrar("La Media de los "+contadorNegativos+" número Negativos->" + mediaNegativos);
        mostrar("La Media de los "+contadorPositivos+" número Negativos->" + mediaPositivos);
        mostrar("Los 0 insertados son "+ contadorCeros);

    }
    public static  void mostrar(String texto) {
        System.out.println(texto);
    }
}
