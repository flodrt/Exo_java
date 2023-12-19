package Ex_11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Exercice 11 :
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple:
        // int[] tab = {1, 2, 9, 4}
         int b = 0;
        int[] tab = { 1, 2, 9, 4 ,55};
        for (int i = 0; i < tab.length - 1; i++) {
             b = Math.max(tab[i], tab[1 + i]);
            
        }

        System.out.println(b);

    }
}
