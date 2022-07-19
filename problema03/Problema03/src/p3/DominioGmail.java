
package p3;

public class DominioGmail implements Dominio{
    private String dominio;
    
    public void establecerDominio(){
        dominio = String.format("@gmail.com");
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}
