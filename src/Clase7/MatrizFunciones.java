package Clase7;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class MatrizFunciones {

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Ingrese el valor: " + i + j);
                matriz[i][j] = lectura.nextInt();
            }
        }
        imprimirDiagonal(matriz);
    }
    
    public static void imprimirDiagonal(int mat[][]){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (i == j){
                    System.out.println("Valores de la diagonal:" + mat[j][j]);
                }
            }
        }
    }
}
