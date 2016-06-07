/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q10;

/**
 *
 * @author arthurcvm
 */
public class ValorMuitoAcimaException extends Exception {
    protected String mensagem;
    
    public ValorMuitoAcimaException(){
        mensagem = "Valor muito acima";
    }
    
    public String toString(){
        return mensagem;
    }
    
}
