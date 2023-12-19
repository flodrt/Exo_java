package Ex_10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Exercice 10 :
        // Écrivez un programme Java qui inverse une chaîne de caractères.
        
        // Aide : Utiliser StringBuilder pour inverser la chaîne de manière efficace
        // https://www.codecademy.com/resources/docs/java/stringbuilder/reverse
        


        Scanner scanner = new Scanner (System.in);
        System.out.println(" votre phrase ?  ");
        String Char = scanner.nextLine();

        StringBuilder str = new StringBuilder(Char);
    
        str.reverse();
        System.out.println(str.toString());
        
    }
}
