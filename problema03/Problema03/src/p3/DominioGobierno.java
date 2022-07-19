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
public class DominioGobierno implements Dominio{
    private String dominio;
    
    @Override
    public void establecerDominio(){
        dominio = String.format("@gobiernoec.gob");
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
