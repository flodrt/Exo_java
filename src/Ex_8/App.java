package Ex_8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//         Exercice 8 :
// Écrire un programme en Java qui  permet de saisir 10 entiers dans un tableau. 
// - compter combien y a-t-il  d'éléments pairs et  impairs.
// - mettre les éléments pairs dans  un tableau T1 et les éléments impaires dans un tableau T2. 
// - Puis afficher T1  et  T2
        
        Scanner scanner = new Scanner (System.in);

        int []tab = new int[10];
        int nbpair =0;

        for (int index = 0; index < 10; index++) {
            System.out.println("donner votre nb"+ index);
            tab[index]=scanner.nextInt();
                if (tab[index] %2 == 0 ) { 
                    nbpair = nbpair+1;

                
            }
        }
        
        
        System.out.printf(" il y a %d nombre pair \n", nbpair);
        System.out.printf(" il y a %d de nombre pair \n ", 10-nbpair);
    
        int []tabpair = new int[nbpair];
        int []tabimpair = new int[10-nbpair];
        int indpair = 0;
        int indimpair = 0;

        for (int i = 0; i < tab.length; i++){
            if (tab[i] %2 == 0 ) { 
                     
                    tabpair[indpair]= tab[i];
                    indpair = indpair + 1 ;
                }  
            else {tabimpair[indimpair]= tab[i];
                indimpair = indimpair + 1 ;
            }


            
        }  
        System.out.println("voivi les pairs");
        for (int i = 0; i < tabpair.length; i++){
            System.out.println(tabpair[i]);

        }
        System.out.println("voivi les impairs");
        for (int i = 0; i < tabimpair.length; i++){
            System.out.println(tabimpair[i]);
        }
        //String nom = scanner.nextLine();
        //System.out.printf("Bonjour  %S ", nom);
        
        
    }
}
