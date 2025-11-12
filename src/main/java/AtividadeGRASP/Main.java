package AtividadeGRASP;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();

        boolean rodando = true;
        while (rodando) {
            // mostrar menu
            System.out.println("\n=== Sistema de Cadastro de Produtos ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine().trim();
            
            switch (opcao) {
                case "1":
                    // cadastrar
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine().trim();

                    System.out.print("Preço: ");
                    String precoStr = scanner.nextLine().trim();
                    double preco;
                    try {
                        preco = Double.parseDouble(precoStr.replace(",", "."));
                    } catch (NumberFormatException e) {
                        System.out.println("Preço inválido. Operação cancelada.");
                        break;
                    }

                    controller.adicionarProduto(nome, preco); // Controller -> Creator
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case "2":
                    // listar
                    List<Produto> lista = controller.listarProdutos();
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\nProdutos cadastrados:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i+1) + " - " + lista.get(i));
                        }
                    }
                    break;

                case "0":
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
