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
public class Software extends Produto{
    private double versao;
    
    Software(String descricao, double valor, int qtdEstoque, Fornecedor fornecedor, double versao){
        super(descricao, valor, qtdEstoque, fornecedor);
        this.versao = versao;
    }
    
    public void imprimir(){
        System.out.println("Produto com software-->");
        super.imprimir();
        System.out.println("Versão do Software: " + this.versao);
        fornecedor.imprimir();
    }
}
