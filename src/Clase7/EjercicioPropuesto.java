package Clase7;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class EjercicioPropuesto {

    public static void main(String[] args) {
        int[][] notas = new int[3][3];
        double[] promedio = new double[3];
        DecimalFormat formato = new DecimalFormat("##.00");
        Scanner lectura = new Scanner(System.in);
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas.length; columna++) {
                System.out.println("Ingrese la nota " + (columna + 1) + " del estudiante " + (fila + 1) + ":");
                notas[fila][columna] = lectura.nextInt();
            }
        }
        for (int fila = 0; fila < notas.length; fila++) {
            promedio[fila] = 0;
            for (int columna = 0; columna < notas.length; columna++) {
                promedio[fila] = promedio[fila] + notas[fila][columna];
            }
            promedio[fila] = promedio[fila] / 3;
        }
        for (int fila = 0; fila < promedio.length; fila++){
            System.out.println("El promedio del alumno " + (fila + 1) + " es: " + formato.format(promedio[fila]));
        }
    }
}
