/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author PERSONAL
 */
public class Problema08 {
    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};

        double[][] resultado = new double[2][3];


        for (int i = 0; i < 2; i++) {       
            for (int j = 0; j < 3; j++) {   
                
                if (dato1[i][j] < dato2[i][j]) {
                    resultado[i][j] = dato1[i][j];
                } else {
                    resultado[i][j] = dato2[i][j];
                }

                System.out.printf("%.0f\t", resultado[i][j]);
            }
            System.out.println(); 
        }
    }
}
