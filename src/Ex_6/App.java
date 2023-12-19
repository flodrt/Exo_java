package Ex_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // Exercice 6 :
// Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour 
// afficher la somme (addition), multiplier, soustraire, diviser et le reste.v
        
        Scanner scanner = new Scanner (System.in);
        System.out.println(" a ?  ");
        double a = scanner.nextDouble();
        System.out.println(" b ?  ");
        double b = scanner.nextDouble();

        scanner.close(); 


        double c = a+b;
        System.out.println(" a + b :  " + c );
        
         c = a*b;
        System.out.println(" a * b :  " + c );

        c = a-b;
        System.out.println(" a - b :  " + c );

        if (b == 0 ) {
            System.out.println(" division impossible car :: Erreur div par  " + b );
            
        } else {
            c  = a/b;
        System.out.println(" a / b :  " + c );
        }
        ///sgdsdgsdgD

          c  = a %b;
        System.out.println(" le reste de a / par bq :  " + c );

    }
}
