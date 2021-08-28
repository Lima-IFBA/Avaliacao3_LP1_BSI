/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioavaliativo3;

/**
 *
 * @author gusta
 */
public class Hardware extends Produto{
    private int numeroSerie;
    
    Hardware(String descricao, double valor, int qtdEstoque, Fornecedor fornecedor, int numeroSerie){
        super(descricao, valor, qtdEstoque, fornecedor);
        this.numeroSerie = numeroSerie;
    }
    
    public void imprimir(){
        System.out.println("Produto com hardware-->");
        super.imprimir();
        System.out.println("Número de série do hardware: " + this.numeroSerie);
        fornecedor.imprimir();
    }
}
