/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        
        
        //Dominios
        DominioGmail domG = new DominioGmail();
        domG.establecerDominio();
        DominioGobierno domGob = new DominioGobierno();
        domGob.establecerDominio();
        DominioOutlook domOut = new DominioOutlook();
        domOut.establecerDominio();
        DominioUTPL domUTPL = new DominioUTPL();
        domUTPL.establecerDominio();
        DominioYahoo domYahoo = new DominioYahoo();
        domYahoo.establecerDominio();
        //Correos
        Correo cG = new Correo();
        cG.establecerDominio(domG);
        cG.establecerUserName(e.obtenerUserName());
        
        Correo cGob = new Correo();
        cGob.establecerDominio(domGob);
        cGob.establecerUserName(e.obtenerUserName());
        
        Correo cO = new Correo();
        cO.establecerDominio(domOut);
        cO.establecerUserName(e.obtenerUserName());
        
        Correo cU = new Correo();
        cU.establecerDominio(domUTPL);
        cU.establecerUserName(e.obtenerUserName());
        
        Correo cY = new Correo();
        cY.establecerDominio(domYahoo);
        cY.establecerUserName(e.obtenerUserName());
        //Lista
        ArrayList<Correo> lista = new ArrayList<>();
        lista.add(cG);
        lista.add(cGob);
        lista.add(cO);
        lista.add(cU);
        lista.add(cY);
            //Método que forma el correo
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerCorreo();
        }
        
        //Estudiante
        e.establecerCorreos(lista);
        //Presentación
        System.out.printf("%s\n", e);
        
        
    }
    
}
