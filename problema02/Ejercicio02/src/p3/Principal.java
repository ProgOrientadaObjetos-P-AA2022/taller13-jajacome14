/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
import p2.Matriculas;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {

        ArrayList<Matriculas> matriculas = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcolegio = new MatriculaColegio();
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        
        matriculas.add(mcamp);
        matriculas.add(mcolegio);
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);
        
        for (int i = 0; i < matriculas.size(); i++) {
            matriculas.get(i).establecerNombre();
            matriculas.get(i).establecerTarifa();
        }


        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(matriculas);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("%s\n", tipos);
    }
}
