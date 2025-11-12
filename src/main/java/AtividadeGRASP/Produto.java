/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package AtividadeGRASP;

/**
 *
 * @author leona
 */

//classe produto e seus atributos, nome e preço
public class Produto {

    private String nome;
    private double preco;
    
    //construtor
    public Produto(String nome, double preco){
     this.nome = nome;
     this.preco = preco;
    }
    
    //Getters e Setters
    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
