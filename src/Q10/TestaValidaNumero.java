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
public class TestaValidaNumero {
    void validaNumero(int num){
        try{
            if(num <= 0){
                throw new ValorAbaixoException();
            }
            else if(num > 100 && num < 1000){
                throw new ValorAcimaException();
            }
            else if(num >= 1000){
                throw new ValorMuitoAcimaException();
            }
        } catch (ValorAbaixoException ex) {
            System.err.println(ex.toString());
        } catch (ValorAcimaException ex) {
            System.err.println(ex.toString());
        } catch (ValorMuitoAcimaException ex){
            System.err.println(ex.toString());
        }
    }
    
}
