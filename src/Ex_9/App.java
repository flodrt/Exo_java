package Ex_9;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // Exercice 9 :
        // Écrivez un programme Java qui itère les entiers de 1 à 100 :
        // ‐ Pour les multiples de trois, imprimez "Fizz" au lieu du nombre et pour les multiples de cinq
        // imprimez "Buzz".
        // ‐ Pour les nombres qui sont des multiples de trois et cinq, imprimez "FizzBuzz".

        Scanner scanner = new Scanner (System.in);
        

            for (int index = 1; index < 100; index++) {
                if (index %3 == 0 && index %5==0) {
                    System.out.println("FizzBuzz");
                }
                else if (index %5==0) {
                    System.out.println("Buzz");
                }
                else if (index %3==0) {
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(index);
                }
            }
        
       
    
        
        
        
    }
}
