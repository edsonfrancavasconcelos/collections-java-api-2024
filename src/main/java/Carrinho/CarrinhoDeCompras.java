package main.java.Carrinho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo
    private List<Produto> listaProdutos;

    public CarrinhoDeCompras() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(String nome) {
        listaProdutos.add(new Produto(nome.trim()));
    }

    public void removerProduto(String nome) {
        nome = nome.trim();  // Remove espaços extras antes de comparar
        Iterator<Produto> iterator = listaProdutos.iterator();
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            if (p.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
            }
        }
    }

    public int obterNumeroTotalProdutos() {
        return listaProdutos.size();
    }

    public void obterNomesProdutos() {
        for (Produto p : listaProdutos) {
            System.out.println(p.getNome());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto("Produto 1 ");
        carrinho.adicionarProduto("Produto 2  ");
        carrinho.adicionarProduto("Produto 3 ");
        carrinho.adicionarProduto("Produto 4 ");
        carrinho.adicionarProduto("Produto 5 ");
        carrinho.adicionarProduto("Produto 6 ");

        carrinho.removerProduto("Produto 3 ");
        System.out.println("O número total de produtos no carrinho é " + carrinho.obterNumeroTotalProdutos());

        carrinho.obterNomesProdutos();
    }

    public static class Produto {
        private String nome;

        public Produto(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }
}
