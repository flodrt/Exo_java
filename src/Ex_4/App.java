package Ex_4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercice 4 :
// //Une boutique propose à ses clients, une réduction de 15% pour les montants
// // d’achat supérieurs à 200 Euros. 
// Écrire un programme en Java permettant de saisir le prix total HT et de
//  calculer le  montant TTC en prenant en compte la réduction et la TVA=20%. 
        Scanner scanner = new Scanner (System.in);

        System.out.println("Hello, World!");
        System.out.println("Saisir le montant ht :   ");
         double ht = scanner.nextInt();

         double ttc = ht / 0.8;
         

         if (ttc>200) {
            double ttcremise = ttc*0.85;
            System.out.println("prix a payer avec la reduction de 15 % : " + ttcremise );
         } else {
        
            System.out.println("Pas de remise !! prix a payer  : " + ttc );
         }


    }
}
