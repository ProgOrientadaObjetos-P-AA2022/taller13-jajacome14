/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class DominioYahoo implements Dominio{
    private String dominio;
    
    @Override
    public void establecerDominio(){
        dominio = String.format("@yahoo.es");
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
