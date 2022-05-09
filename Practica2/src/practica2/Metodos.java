
package practica2;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Metodos {
    
    
    public static String IntroducirNumero(){
        Scanner sc = new Scanner(System.in);
        String numero;
        do {
                System.out.println("\n Introdueix el numero. ");
                numero = sc.nextLine();
            } while (!numero.matches("[+-]?[\\d]*[.]?[\\d]+"));
        
        
        return numero;
        
    }
    
    public static void Menu(){
        
        System.out.println("\n Operació? (Indica el signe)");
                System.out.println("+ = sumar \n\t - = restar \n\t"
                        + " x = multiplicar \n\t / = dividir \n\t * = elevar primer num al segon num."
                        + "\n\t % = residu");
        
    }
    
    
    
}
