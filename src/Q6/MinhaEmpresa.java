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
public class MinhaEmpresa {
    public static void main(String args[]){
        Funcionario funcionario = new Funcionario();
        Consultor consultor = new Consultor();
        
        funcionario.setSalario(500);
        consultor.setSalario(1000);
        
        System.out.println("Funcionario: "+funcionario.getSalario());
        System.out.println("Consultor: "+consultor.getSalario());
        System.out.println("Consultor +20%: "+consultor.getSalario(20));
    }    
}
