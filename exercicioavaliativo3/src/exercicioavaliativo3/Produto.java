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
public class Produto {
    protected String descricao;
    protected double valor;
    protected int qtdEstoque;
    protected Fornecedor fornecedor;
    
    public Produto(String descricao, double valor, int qtdEstoque, Fornecedor fornecedor){
        this.descricao = descricao;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }
    public boolean baixarEstoque(int qtd){
        if (qtdEstoque < qtd){
            System.out.println("Quantidade insuficiente");
            return false;
        }else{
            qtdEstoque -= qtd;
            return true;
        }
    }
    public void subirEstoque(int qtd){
        qtdEstoque += qtd;
    }
    
    public void imprimir(){
        System.out.println("Descrição do produto: " + descricao);
        System.out.println("Valor do produto: " + valor);
        System.out.println("Quantidade no estoque: " + qtdEstoque);
    }
}
