package Ex_table_de_multiplication;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

//         //#ecrire un algo qui demande un nombre de depart
//         //# et qui ensuite ecrit la table de multiplication de ce nombre
//         # présentée comme suit (exemple pour 7 )

// # table de 7 : 7*1=7
// # 7*2=14
// # 7*3=21
// # ...
// # 7*10=70

        Scanner scanner = new Scanner (System.in);
        System.out.println(" Un nombre svp ");
        int nb1 = scanner.nextInt();

            for (int index = 0; index < 11; index++) {
                int resultat =  nb1*index;
                System.out.printf("%d * %d = %d  \n",index,nb1, resultat );
            }
        
       
    
        
        
        
    }
}
