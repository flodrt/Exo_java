package Ex_12;

import java.util.Scanner;
import java.util.Random; 
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        // Exercice 12 : Nombre magique
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre choisi aléatoirement par l'ordinateur. 
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à deviner est plus grand ou plus petit que la proposition de l'utilisateur. 
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné le nombre.
        
        // Aide :
        // La boucle while est appropriée pour cet exercice car le nombre de tentatives nécessaires pour deviner le nombre
        // est inconnu à l'avance. 
        // La boucle while continue tant que la condition spécifiée est vraie.
        
        Scanner scanner = new Scanner (System.in);

        Random rand = new Random();
        int nbsecret = rand.nextInt(100);
        int nb = 101;
        System.out.println("le nb secret "+ nbsecret);
        while (nbsecret != nb ) {
            System.out.println("Saisir un nb   :   ");
            nb = scanner.nextInt();
                if (nb<nbsecret){ 
                    System.out.println("Plus garnd");
                }
                else if (nb>nbsecret) {
                    System.out.println("Plus petit");
                }




            
        }


     

    }
}
