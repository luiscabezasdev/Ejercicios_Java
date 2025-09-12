import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        CapturaDatos[] datos = capturarPersonas();
        double promedio = calcularPromedioEdad(datos);
        int hombres = contarHombres(datos);
        int mujeres = contarMujeres(datos);

        System.out.println("Promedio de edad: " + promedio);
        System.out.println("Número de hombres: " + hombres);
        System.out.println("Número de mujeres: " + mujeres);
    }

    public static CapturaDatos[] capturarPersonas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas personas desea capturar? ");
        int n = sc.nextInt();
        sc.nextLine();
        CapturaDatos[] personas = new CapturaDatos[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Género (H/M): ");
            String genero = sc.nextLine();
            personas[i] = new CapturaDatos(nombre, edad, genero);
        }
        sc.close();
        return personas;
    }

    public static double calcularPromedioEdad(CapturaDatos[] datos) {
        if (datos.length == 0) {
            return 0;
        }
        int suma = 0;
        for (CapturaDatos d : datos) {
            suma += d.getEdad();
        }
        return (double) suma / datos.length;
    }

    public static int contarHombres(CapturaDatos[] datos) {
        int count = 0;
        for (CapturaDatos d : datos) {
            if (d.getGenero().equalsIgnoreCase("H")) {
                count++;
            }
        }
        return count;
    }

    public static int contarMujeres(CapturaDatos[] datos) {
        int count = 0;
        for (CapturaDatos d : datos) {
            if (d.getGenero().equalsIgnoreCase("M")) {
                count++;
            }
        }
        return count;
    }
}
