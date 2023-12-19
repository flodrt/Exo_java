package Ex_7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Exercice 7 :
        // Écrivez un programme Java qui accepte trois nombres 
        // et affiche "Tous les nombres sont égaux" si les trois nombres sont égaux, "Tous les nombres 
        // sont différents" si les trois nombres sont différents et sinon "Ni tous ni égaux ni différents".
        
        Scanner scanner = new Scanner (System.in);
        System.out.println(" nb1 ");
        int nb1 = scanner.nextInt();

        System.out.println(" nb2 ");
        int nb2 = scanner.nextInt();

        System.out.println(" nb3 ");
        int nb3 = scanner.nextInt();

        if (nb1 != nb2 && nb1 != nb3 && nb2 != nb3 ) {
            System.out.println("Tout les nombres sont differents");
            
        }
        else if ( nb1 == nb2 && nb2 == nb3 ) {
            System.out.println("Tout les nombres sont egaux");
     }
        else {
            System.out.println("Ni egaux ni differents");
        }
        
        
        
    }
}
