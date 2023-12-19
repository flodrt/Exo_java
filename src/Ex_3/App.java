package Ex_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Exercice 3 :
        //Écrire  un programme en Java  qui  permet d'échanger le contenu 
        //de deux entiers  A et B  saisis par l'utilisateur. et afficher ces entiers 
        // après l’échange.

         Scanner scanner = new Scanner (System.in);

        System.out.println("Hello, World!");
        System.out.println("Saisir une valeur de b :   ");
         int b = scanner.nextInt();

         System.out.println("Saisir une valeur de a :   ");
         int a = scanner.nextInt();

         int c = b;
         b = a ;
         a = c ;

         System.out.printf("Les valeurs inverses sont donc : a = %d  et b= %d " , a , b );
    }
}
