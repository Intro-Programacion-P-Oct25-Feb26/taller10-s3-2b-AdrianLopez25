/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},  
            {8, 15, 33, 38},  
            {6, 10, 30, 36}   
        };

        int total_menores = 0;
        int[] adultos_familia = new int[edades.length];

        for (int i = 0; i < edades.length; i++) {
            int contador_a = 0; 

            for (int j = 0; j < edades[i].length; j++) {
                int edad1 = edades[i][j];

                if (edad1 < 18) {
                    total_menores++;
                } else {
                    contador_a++;
                }
            }

            adultos_familia[i] = contador_a;
        }

        System.out.printf("Total de menores de edad: "
                + total_menores);
        
        System.out.println("\nTotal de adultos por familia:");
        for (int i = 0; i < adultos_familia.length; i++) {
            System.out.println("Familia " + (i+1) + ": " + adultos_familia[i]
                    + " adultos");
        }
    }
}
   

