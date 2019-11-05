/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Pessoa {
    
    private String Nome;
    private String Sobrenome;
    private String CPF;
    ArrayList<Conta>conta = new ArrayList();

    public Pessoa() {
    }

    public Pessoa(String Nome, String Sobrenome, String CPF) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }
    
    
    public void validarCPF(String CPF){
        if (this.CPF.equals(CPF))
            System.out.println("CPF valido");
        else
            System.out.println("CPF Invalido");
        
    }
    public void getNomeCompleto(){
        System.out.println("Nome: "+this.Nome +" "+ this.Sobrenome);
    }
}
