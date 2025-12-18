/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},   // Zona 0
            {true, false, true, false, true, false}, // Zona 1
            {false, false, false, false, false, false}, // Zona 2
            {true, true, false, true, true, false} // Zona 3
        };

        int sin_fallos = 0;
        String reporte = "";

        for (int i = 0; i < sensores.length; i++) {
            int fallos = 0;

            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    fallos = fallos + 1;
                }
            }

            if (fallos == 0) {
                sin_fallos=  sin_fallos + 1;
            } else {
                reporte = String.format(
                        "%sZona %d presenta %d fallos\n",
                        reporte,
                        i ,
                        fallos);
            }
        }

        reporte = String.format(
                "%s\nZonas que funcionan sin fallos: %d",
                reporte,
                sin_fallos
        );

        System.out.println(reporte);
    }
}
