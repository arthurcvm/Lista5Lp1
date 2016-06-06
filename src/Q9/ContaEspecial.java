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
public class ContaEspecial extends Conta {
    
    public ContaEspecial(String nomeCliente, double salarioMensal, double numeroConta, double saldo) {
        super(nomeCliente, salarioMensal, numeroConta, saldo);
    }
    
    @Override
    public void definirLimite(){
        limite = (salarioMensal*3);
    }
    
}
