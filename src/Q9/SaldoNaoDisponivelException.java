/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q9;

/**
 *
 * @author arthurcvm
 */
public class SaldoNaoDisponivelException extends Exception {
    protected String mensagem;
    
    public SaldoNaoDisponivelException(String mensagem){
        this.mensagem = mensagem;
    }
    
    @Override
    public String toString(){
        return mensagem;
    }
    
}
