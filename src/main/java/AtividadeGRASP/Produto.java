package AtividadeGRASP;

//classe produto e seus atributos, nome e preço
public class Produto {

    private String nome;
    private double preco;
    private int id;
    
    //construtores
    
    //construtor padrão
    public Produto(){
     //vazio 
    }
    
    public Produto(String nome, double preco, int id){
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
    
     public void setId(int id) {
        this.id = id;
    }
     
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Preço: R$ " + String.format("%.2f", preco);
    }
     
}
