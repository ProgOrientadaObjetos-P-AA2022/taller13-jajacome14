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
public class MatriculaEscuela extends Matriculas{
    private double tarifa;
    private String nombre;

    public void establecerNombre(){
        nombre = "Matricula Escuela";
    }
    public void establecerTarifa(){
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }
        
    public String obtenerNombre(){
        return nombre;
    }

    public double obtenerTarifa(){
        return tarifa;
    }

    @Override
    public String toString(){
        String cadena = String.format("%s - Tarifa: %.2f", 
        obtenerNombre(),
        obtenerTarifa());

        return cadena;
    }
}
