/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matriz = new double[5][6];
        double[][] matriz_resultante = new double[5][6];
        double multiplicador;

        System.out.print("Ingrese un número para multiplicar: ");
        multiplicador = entrada.nextDouble();

        System.out.println("\n INGRESO DE DATOS:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz_resultante[i][j] = matriz[i][j] * multiplicador;
            }
        }

        System.out.println("\n MATRIZ INICIAL :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n MATRIZ RESULTANTE (Multiplicada por : " + multiplicador + ")");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz_resultante[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


