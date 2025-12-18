/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
     int[][] matriz_a = new int[3][2];
        int[][] matriz_b = new int[3][2];

        System.out.println(" MATRIZ A :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese valor A[" + i + "][" + j + "]: ");
                matriz_a[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\n MATRIZ B :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese valor B[" + i + "][" + j + "]: ");
                matriz_b[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\n MATRIZ A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz_a[i][j] + "\t");
            }
            System.out.println(); 
        }


        System.out.println("\n MATRIZ B :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz_b[i][j] + "\t");
            }
            System.out.println();
        }

        boolean mayor_igual = true; 
 
        boolean estricto_mayor = false; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (matriz_a[i][j] < matriz_b[i][j]) {
                    mayor_igual = false;
                }

                if (matriz_a[i][j] > matriz_b[i][j]) {
                    estricto_mayor = true;
                }
            }
        }

        if (mayor_igual == true && estricto_mayor == true) {
            System.out.println("La matriz A es mayor que la matriz B");
        } else {
            System.out.println("La matriz B es mayor que la matriz A");
        }
    }
}
 
