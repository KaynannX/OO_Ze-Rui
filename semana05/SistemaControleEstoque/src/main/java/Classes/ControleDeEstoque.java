
package Classes;

import java.util.HashMap;

public class ControleDeEstoque {
    private final HashMap<String, Produto> estoque;

    public ControleDeEstoque() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.put(produto.getCodigo(), produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(String codigo) {
        if (estoque.remove(codigo) != null) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) {
        Produto produto = estoque.get(codigo);
        if (produto != null) {
            produto.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque esta vazio.");
        } else {
            for (Produto produto : estoque.values()) {
                System.out.println(produto);
            }
        }
    }

    public Produto buscarProduto(String codigo) {
        return estoque.get(codigo);
    }
}
 