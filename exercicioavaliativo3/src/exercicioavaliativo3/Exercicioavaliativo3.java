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
public class Exercicioavaliativo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseProduto DB = new DatabaseProduto();
        
        Fornecedor fornecedorEx_1 = new Fornecedor(001, "Microsoft", "Redmond, Washington, EUA");
        Software produtoEx_1 = new Software("Microsoft Word", 869.99, 100, fornecedorEx_1, 16.1);
        DB.inserir(produtoEx_1);
        produtoEx_1.imprimir();
        
        System.out.println("");
        
        System.out.println("Dados do 1º produto após 1ª alteração-->");
        produtoEx_1.baixarEstoque(50);
        produtoEx_1.imprimir();
        
        System.out.println("");
        
        System.out.println("Dados do 1º produto após 2ª alteração-->");
        produtoEx_1.subirEstoque(150);
        produtoEx_1.imprimir();
        
        System.out.println("");
        
        
        Fornecedor fornecedorEx_2 = new Fornecedor(002, "NVIDIA", "Santa Clara, Califórnia, EUA");
        Hardware produtoEx_2 = new Hardware("Placa de Vídeo EVGA NVIDIA GeForce GTX 1660", 3199.90, 100, fornecedorEx_2, 14876);
        DB.inserir(produtoEx_2);
        produtoEx_2.imprimir();
        
        System.out.println("");
        
        System.out.println("Dados do 2º produto após 1ª alteração-->");
        produtoEx_2.baixarEstoque(50);
        produtoEx_2.imprimir();
        
        System.out.println("");
        
        System.out.println("Dados do 2º produto após 2ª alteração-->");
        produtoEx_2.subirEstoque(150);
        produtoEx_2.imprimir();
    }
    
}
