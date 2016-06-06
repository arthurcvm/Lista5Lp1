/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q8;

/**
 *
 * @author arthurcvm
 */
public class Trabalhador {
    protected String nome;
    protected double salario;
    
    public double calcularpagamento(int horas){
        return salario+horas;
    }
    
}
