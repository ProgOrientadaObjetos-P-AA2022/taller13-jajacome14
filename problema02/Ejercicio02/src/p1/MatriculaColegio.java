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
public class MatriculaColegio extends Matriculas {
    private double tarifa;
    private String nombre;

    public void establecerNombre() {
        nombre = "Matricula Colegio";
    }

    public void establecerTarifa() {
        // tarifa = costo deportes + costo folletos +
        // costo uniformes + costo laboratorios
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
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
