import java.util.Scanner;

package javaapplication2;


public class JavaApplication2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero X: ");
        5
        int X = sc.nextInt();
        
        double Y;
        
        if (X < 0) {
            Y = 100 * X;
            } else if (X >= 0 && X < 3) {   
                Y = 2 * X + 5;
            } else if (X >= 3 && X <= 6) {  
                Y = 100.0 / X;
            } else {
                Y = 0;
        }
        
        System.out.println("El valor de Y es: " + Y);

        sc.close();
    }
    
}
