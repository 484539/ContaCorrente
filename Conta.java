/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author aluno
 */
public class Conta {
    
    private int Numero;
    private double saldo;
    private double limite;
    private Pessoa dono;

    public Conta() {
    }

    public Conta(int Numero, double saldo, double limite, Pessoa dono) {
        this.Numero = Numero;
        this.saldo = saldo;
        this.limite = limite;
        this.dono = dono;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
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

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public void sacar(double valor){
        if (this.saldo + this.limite < valor)
                System.out.println("SAldo Insuficiente");
        else
                this.saldo = this.saldo - valor;
 
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        
    }
    public void Trasnferir(Conta destino, double valor){
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}
