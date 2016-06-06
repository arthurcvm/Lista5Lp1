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
public class Conta implements IConta {
    protected String nomeCliente;
    protected double salarioMensal;
    protected double numeroConta;
    protected double saldo;
    protected double limite;
    
    public Conta(String nomeCliente, double salarioMensal, double numeroConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.salarioMensal = salarioMensal;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        try{
            if(valor > saldo){
                throw new SaldoNaoDisponivelException("Saldo não disponível");
            }
            saldo -= valor;
        }catch(SaldoNaoDisponivelException e){
            System.err.println(e.toString());            
        }
       
    }

    @Override
    public void depositar(double valor) {
       
    }
    
    public void definirLimite(){
        limite = (salarioMensal*2);
    }
    
}
