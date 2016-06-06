/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q6;

/**
 *
 * @author arthurcvm
 */
public class Consultor extends Funcionario {

    @Override
    public double getSalario() {
        return salario += salario*0.1;
    }
    
    public double getSalario(float percentual){
        return (salario += (salario*percentual)/100);
    }
    
}
