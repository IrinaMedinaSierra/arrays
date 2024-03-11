import java.util.Arrays;

public class ConceptosArrays {
    public static void main(String[] args) {

        int numero1[]={1,2,3,4,5,6};
        int numero2[]={1,5,3,4,5,6};
        boolean prueba= Arrays.equals(numero1,numero2);
        System.out.println(prueba);

        /***************** ARRAY BIDIMENSIONALES  ***********************/
        int[][] nuevo=new int[5][5];

        System.out.println(nuevo.length);
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                nuevo[i][j] =(int)(Math.random()*100+1);
                System.out.print(nuevo[i][j]+"-");
            }
        }
        System.out.println("");
        System.out.println(Arrays.deepToString(nuevo));

        /**************/




    }


}
