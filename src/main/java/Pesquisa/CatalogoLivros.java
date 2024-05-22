package main.java.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloDeAno.add(l);
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosPorTitulo = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livrosPorTitulo.add(l);
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor A", 1990);
        catalogo.adicionarLivro("Livro 2", "Autor B", 2000);
        catalogo.adicionarLivro("Livro 3", "Autor A", 2010);
        catalogo.adicionarLivro("Livro 4", "Autor C", 2020);

        System.out.println("Livros do Autor A:");
        List<Livro> livrosDoAutorA = catalogo.pesquisarPorAutor("Autor A");
        for (Livro l : livrosDoAutorA) {
            System.out.println(l.getTitulo());
        }

        System.out.println("\nLivros publicados entre 1995 e 2015:");
        List<Livro> livrosEntre1995e2015 = catalogo.pesquisarPorIntervaloDeAno(1995, 2015);
        for (Livro l : livrosEntre1995e2015) {
            System.out.println(l.getTitulo());
        }

        System.out.println("\nPesquisando por título 'Livro 2':");
        List<Livro> livrosPorTitulo = catalogo.pesquisarPorTitulo("Livro 2");
        for (Livro l : livrosPorTitulo) {
            System.out.println(l.getTitulo() + " -" + l.getAutor() + " (" + l.getAnoPublicacao() + ")");
        }
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
