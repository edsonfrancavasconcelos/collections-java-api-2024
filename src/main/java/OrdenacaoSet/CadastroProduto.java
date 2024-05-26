package main.java.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class CadastroProduto {
    // Atributos
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    // Definição do ComparatorPorPreco
    class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

    // Definição do ComparatorPorQuantidade
    class ComparatorPorQuantidade implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
        }
    }

    // Método main para testar a funcionalidade
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 8", 20d, 51);
        cadastroProduto.adicionarProduto(3L, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Produto 9", 15d, 2);

        System.out.println("Produtos por Nome:");
        for (Produto p : cadastroProduto.exibirProdutoPorNome()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos por Preço:");
        for (Produto p : cadastroProduto.exibirProdutosPorPreco()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos por Quantidade:");
        for (Produto p : cadastroProduto.exibirProdutosPorQuantidade()) {
            System.out.println(p);
        }
    }
}
