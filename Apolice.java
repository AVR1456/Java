/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_lista1_GUI;

/**
 *
 * @author alvaro
 */
public class Apolice {

    private String NomeSegurado;
    private int idade;
    private double ValorPremio;
   
    public String getNomeSegurado() {
        return NomeSegurado;
    }

    
    public void setNomeSegurado(String NomeSegurado) {
        this.NomeSegurado = NomeSegurado;
    }

 
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    public double getValorPremio() {
        return ValorPremio;
    }

 
    public void setValorPremio(double ValorPremio) {
        this.ValorPremio = ValorPremio;
    }
 
     public void CalcularPremioApolice() {
        if (idade > 18 && idade <= 25) {

            ValorPremio += ValorPremio * 20 / 100;
        } else if (idade > 25 && idade <= 36) {

            ValorPremio += ValorPremio * 15 / 100;
        } else if (idade > 36) {
            ValorPremio += ValorPremio * 10 / 100;
        }
    }

    void oferecerdesconto(String cidade) {
        if ("Curitiba".equals(cidade)) {
            
            ValorPremio -= ValorPremio * 20 / 100;
        } else if ("Rio de Janeiro".equals(cidade)) {
            ValorPremio -= ValorPremio * 15 / 100;
        } else if ("Sao Paulo".equals(cidade)) {
            ValorPremio -= ValorPremio * 10 / 100;
        } else if ("Belo Horizonte".equals(cidade)) {
            ValorPremio -= ValorPremio * 5 / 100;
        }
    }
    
    
    
}
