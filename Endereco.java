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
public class Endereco {
    
    private String Rua;
    private String Numero;
    private String Cidade;
    private String Estado;
    private String CEP;
    ArrayList<Pessoa>reside = new ArrayList();

    public Endereco() {
    }

    public Endereco(String Rua, String Numero, String Cidade, String Estado, String CEP) {
        this.Rua = Rua;
        this.Numero = Numero;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public ArrayList<Pessoa> getReside() {
        return reside;
    }

    public void setReside(ArrayList<Pessoa> reside) {
        this.reside = reside;
    }
    
    public void getLocalizacaobyCEP(String CEP){
        if(this.CEP.equals(CEP)){
            System.out.println("Localização: "+this.CEP +" "+ this.Cidade);
        }
        
    }
}
