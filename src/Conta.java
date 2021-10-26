/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Conta {
    private double depositarSimples;
    private double depositarEspecial;
    private double depositarPoupanca;
    private double saldoAtualSimples;
    private double saldoAtualEspecial;
    private double saldoAtualPoupanca;
    private double limite;
    
    
    public void depositoSimples(double quantia){
        depositarSimples = quantia + saldoAtualSimples; 
    }
    
    public void depositoEspecial(double quantia){
        depositarEspecial = quantia + saldoAtualEspecial; 
    }
    
    public void depositoPoupanca(double quantia){
        depositarPoupanca = quantia + saldoAtualPoupanca; 
    }
    
    public void sacarSimples(double quantia){
        if(quantia>saldoAtualSimples)
            System.out.println("Saldo insuficiente");
        else
            saldoAtualSimples = saldoAtualSimples - quantia;
    }
    
    public void sacarEspecial(double quantia){
        if(quantia<=saldoAtualEspecial)
            saldoAtualEspecial = saldoAtualEspecial - quantia;
        if(quantia>saldoAtualEspecial)
        {
            if(quantia<=limite)
                saldoAtualEspecial = saldoAtualEspecial - quantia;
            else
                System.out.println("Saldo insuficiente");
                
        }
    }
    
    public void sacarPoupanca(double quantia){
        if(quantia<=saldoAtualPoupanca)
            saldoAtualPoupanca = saldoAtualPoupanca - quantia;
        else
            System.out.println("Saldo insuficiente");
            
    }
}
    

