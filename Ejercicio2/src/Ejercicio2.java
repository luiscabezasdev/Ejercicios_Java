import java.util.Scanner;

package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la pared en metros cuadrados ");
        
        int metros = sc.nextInt();
        
        int tipoLadrillo;
        
        System.out.println("=== MENÚ UNO ===");
        System.out.println("1. Tipo de ladrillo A");
        System.out.println("2. Tipo de ladrillo B");
        System.out.println("3. Tipo de ladrillo C");
        System.out.print("Elige una opción 1, 2 o 3: ");
        tipoLadrillo = sc.nextInt();
        
        int manodeObra;
        
        System.out.println("=== MENÚ DOS ===");
        System.out.println("1. Mano de obra calificada");
        System.out.println("2. Mano de obra común");
        System.out.print("Elige una opción 1 o 2: ");
        manodeObra = sc.nextInt();
        
        
        int totalLadrillos = metro * 45;
        
        totalLadrillo >= 200 y tipoLadrillo == A ó B
                
        verdadero 5% descuento para ladrillo A y B
                
        falso es porque es tipo C
        
        No tiene descuento porque es tipo C
                
        Mano de obra calificada
        metros * 15000
        
        no tiene un descuento
                
        Mano de obra comun
        metros * 12000
        y se le agrega un sobre costo del 15%        
                
        
        
        sc.close();
    }
    
}
