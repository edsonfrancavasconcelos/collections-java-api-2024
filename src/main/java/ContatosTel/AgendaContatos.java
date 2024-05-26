package main.java.ContatosTel;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributos
    private Set<Contato> contatoSet;

    // Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Método para adicionar contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Método para exibir todos os contatos
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // Método para pesquisar contatos por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    // Método para atualizar o número de um contato
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Edson",12312312);
        agendaContatos.adicionarContato("Edson",12312333);
        agendaContatos.adicionarContato("Edson Vasconcelos",13312312);
        agendaContatos.adicionarContato("Edson Silva",1212312);
        agendaContatos.adicionarContato("Edson Cavalcanti",2312312);
        agendaContatos.adicionarContato("Valeria Souza",12512312);
        agendaContatos.adicionarContato("Agnus Souza",1512312);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Edson"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Valeria Souza",22222222));

        agendaContatos.exibirContatos();
    }
}
