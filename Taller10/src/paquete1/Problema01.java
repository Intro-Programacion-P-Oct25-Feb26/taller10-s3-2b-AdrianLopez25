/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},   
            {true, false, false, true, false}, 
            {true, true, true, true, true},    
            {false, true, true, false, true}   
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] total_asistencias = new int[estudiantes.length];

        for (int i = 0; i < total_asistencias.length; i++) {
            int contador = 0;

            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    contador++;
                }
            }

            total_asistencias[i] = contador;

            System.out.printf("Estudiante:%s | Asistencias:%s "
                    ,estudiantes[i],total_asistencias[i]);
            
            if (total_asistencias[i] == 5) {
                System.out.println("Cumple con sus asistencias semanal");
            } else {
                System.out.println("No cumple con todas sus asistencias");
            }
        }
    }
}
    
