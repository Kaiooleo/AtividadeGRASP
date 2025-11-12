package AtividadeGRASP;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    
    // lista que guarda os produtos
    private List<Produto> produtos;
    
    
    //construtor
    public ProdutoController(){
        this.produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(String nome, double preco){
        int novoId = produtos.size() + 1;
        Produto p = new Produto(nome, preco, novoId);
        produtos.add(p);
    }
    
    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos);
    }
    
}

