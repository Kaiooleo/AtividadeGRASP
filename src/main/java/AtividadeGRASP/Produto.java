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
    private long id;
    
    //construtores
    
    //construtor padrão
    public Produto(){
     //vazio 
    }
    
    public Produto(String nome, double preco, long id){
     this.nome = nome;
     this.preco = preco;
     this.id = id;
    }
    
    //Getters e Setters
    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    
    public long getId() {
        return id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     public void setId(long id) {
        this.id = id;
    }
}
