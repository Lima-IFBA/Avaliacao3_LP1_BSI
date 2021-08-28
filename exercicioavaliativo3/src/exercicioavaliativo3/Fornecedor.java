
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
public class Fornecedor {
    private int codigo;
    private String nome;
    private String endereco;
    
    public Fornecedor(int codigo, String nome, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void imprimir(){
        System.out.println("Código do fornecedor: " + this.codigo);
        System.out.println("Nome do fornecedor: " + this.nome);
        System.out.println("Endereço do fornecedor: " + this.endereco);
    }
    
}
