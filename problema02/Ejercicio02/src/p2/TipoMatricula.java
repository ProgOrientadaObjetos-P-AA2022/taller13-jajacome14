/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
import java.util.ArrayList;

public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matriculas> matriculas;

    public void establecerMatriculas(ArrayList<Matriculas> m) {
        matriculas = m;
    }

    public ArrayList<Matriculas> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("-----Listado Matriculas----\n");

        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s\n%s", cadena, matriculas.get(i));
        }
        cadena = String.format("%s\nPromedio: %.2f\n",
                cadena,
                obtenerPromedioTarifas());
        return cadena;
    }
}
