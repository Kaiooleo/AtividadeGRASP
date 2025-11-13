package AtividadeGRASP;

import java.util.ArrayList;
import java.util.List;

// PADRÃO GRASP Controller 
// Responsável por lidar com as ações do usuário.
// O main deixa para a classe Controller, o papel de manipular diretamente os produtos.
// Dessa forma o projeto fica mais limpo e organizado, centralizando o processo de cadastro e listagem de produtos,
// atendendo os princípios GRASP.
public class ProdutoController {
    
    // lista que guarda os produtos
    private List<Produto> produtos;
    
    //construtor
    public ProdutoController(){
        this.produtos = new ArrayList<>();
    }   
    
// PADRÃO GRASP Creator
// O controller é quem cria os objetos produtos, já que ele está diretamente relacionado com eles (Cadastro e Listagem),
// então a criação deles fica em quem realmente usa esses objetos.
    public void adicionarProduto(String nome, double preco){
        int novoId = produtos.size() + 1;
        Produto p = new Produto(nome, preco, novoId); // CREATOR
        produtos.add(p);
    }
 // Listar os produtos cadastrados.   
    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos);
    }
    
}

