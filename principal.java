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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Pessoa objPessoa = new Pessoa("Lucas","Eduardo","123456789");
        Endereco objEnd = new Endereco("Ipe amarelo","219","Promissao","SP","16370000");
        Conta objConta = new Conta(666,1500,1000,new Pessoa ("Willian","GUbiaani","123456"));
        Conta objConta2 = new Conta(123,0,100,new Pessoa ("Lucas","Rodrigues","123456879"));
        

        
        
        
        
        objConta.sacar(500);
        objConta.depositar(100);
        objConta.Trasnferir(objConta2, 100);
        objConta.getDono().getNomeCompleto();
        objConta2.getDono().getNomeCompleto();
        
        System.out.println("Saldo Conta 1: "+objConta.getSaldo());
        System.out.println("Saldo Conta 2: "+ objConta2.getSaldo());
        //objPessoa.getNomeCompleto();
        //objPessoa.validarCPF("123456789");
        
        
        
        objEnd.getLocalizacaobyCEP("16370000");
    }
    
}
