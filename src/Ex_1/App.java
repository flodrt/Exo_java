package Ex_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercice 1 :
// Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer 
//de sa catégorie sachant que les catégories sont les suivantes: 
// "poussin de 6 a 7 ans"
// "pupille de 8 a 9 ans "
// "minime de 10 a 11 ans "
//" cadet après 12 ans ".
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Hello, World!");
        System.out.println("Quel age ? ");
         int age1 = scanner.nextInt();
          switch (age1) {
            case 6 :
            case 7 : 
              System.out.println("poussin");
                
                break;
            case 8 :
            case 9 :
                System.out.println("pupille");
            case 10 :
            case 11 : 
                System.out.println("minime");
                break;
            default:
            System.out.println("cadet");
                break;
          }     
    }
}
