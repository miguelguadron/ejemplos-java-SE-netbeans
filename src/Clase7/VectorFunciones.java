package Clase7;
import java.util.Scanner;

/**
 *
 * @author memux
 */
public class VectorFunciones {
    public static void main(String[] args){
        int[] vector = new int[5];
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("Ingrese el valor: " + i);
            vector[i] = lectura.nextInt();
        }
        parImpar(vector);
    }
    
    static void parImpar(int vec[]){
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < vec.length; i++){
            if (vec[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("El total de números pares es: " + pares);
        System.out.println("El total de números impares es: " + impares);
    }
}
