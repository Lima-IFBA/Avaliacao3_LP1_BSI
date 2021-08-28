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
public class DatabaseProduto {
    private Produto[] produtosDB; 
    private int indice;
    
    public DatabaseProduto() {
        this.produtosDB = new Produto[2];
        indice = 0;
    }
    
    public void inserir(Produto ex){
        produtosDB[indice] = ex;
        indice++;
    }
    
    
    
}
