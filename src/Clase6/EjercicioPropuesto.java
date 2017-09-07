package Clase6;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class EjercicioPropuesto {

    public static void main(String[] args) {
        final double claseA = 7.00;
        final double claseB = 8.50;
        final double claseC = 10.00;
        final double claseD = 12.50;
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("$ ####.00");
        char categoria;
        int horas;
        int seguir = 0;
        System.out.println(".: ¡Bienvenido! :.");
        do {
            System.out.println("Ingrese la categoría del empleado:");
            categoria = leer.next().charAt(0);
            System.out.println("Ingrese las horas trabajadas por el empleado en la semana:");
            horas = leer.nextInt();
            switch (categoria) {
                case 'a':
                case 'A':
                    System.out.println("El sueldo del empleado es: " + formato.format(horas * 4 * claseA));
                    break;
                case 'b':
                case 'B':
                    System.out.println("El sueldo del empleado es: " + formato.format(horas * 4 * claseB));
                    break;
                case 'c':
                case 'C':
                    System.out.println("El sueldo del empleado es: " + formato.format(horas * 4 * claseC));
                    break;
                case 'd':
                case 'D':
                    System.out.println("El sueldo del empleado es: " + formato.format(horas * 4 * claseD));
                    break;
                default:
                    System.out.println("¡Ha seleccionado una categoría que no existe!");
                    break;
            }
            System.out.println("¿Desea seguir calculando sueldos?\n0 - No\n1 - Sí");
            seguir = leer.nextInt();
        } while (seguir == 1);
        System.out.println(".: ¡Gracias por utilizar la aplicación! :.");
    }
}
