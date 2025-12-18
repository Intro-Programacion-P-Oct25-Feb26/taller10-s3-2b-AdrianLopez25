/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {

        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String acumulador = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                
                String nombre = estudiantes[i][j];

                char letra = nombre.charAt(0);

                if (letra == 'S' || letra == 'P' || letra == 'T') {
                    acumulador = acumulador + nombre + "\n";
                }
            }
        }

        System.out.println("Estudiantes con las primeras letras (S, P, T)");
        System.out.println(acumulador);
    }
}

