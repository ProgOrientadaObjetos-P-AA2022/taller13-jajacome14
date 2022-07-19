/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matriculas;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matriculas {
    private double tarifa;
    private String nombre;

    public void establecerNombre() {
        nombre = "Matricula Colegio";
    }

    public void establecerTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        String cadena = String.format("%s - Tarifa: %.2f", 
        obtenerNombre(),
        obtenerTarifa());

        return cadena;
    }
}
