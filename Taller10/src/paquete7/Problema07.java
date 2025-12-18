/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz_X = new int[3][3];
        int[][] matriz_A = new int[3][3];
        int[][] matriz_B = new int[3][3];

        System.out.println(" INGRESO DE VALORES: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor para[" + i + "][" + j + "]: ");
                matriz_X[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = matriz_X[i][j];
                matriz_A[i][j] = (x + 1) * (x + 1);
                matriz_B[i][j] = (x * x) + (2 * x) + 1;
            }
        }

        boolean Cumple = true; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz_A[i][j] != matriz_B[i][j]) {
                    Cumple = false;
                }
            }
        }

        System.out.println("\n Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz_A[i][j] + "\t");
            }
            System.out.println(); 
        }


        System.out.println("\n Matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz_B[i][j] + "\t");
            }
            System.out.println();
        }
        
        if (Cumple == true) {
            System.out.println("La identidad algebraica se cumple.");
        } else {
            System.out.println("La identidad algebraica no se cumple.");
        }
    }
}
