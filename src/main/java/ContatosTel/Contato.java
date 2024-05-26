package main.java.ContatosTel;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;

    private  int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public int getNumero() {
        return numero;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato that = (Contato) o;
        return Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "FoneContato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
