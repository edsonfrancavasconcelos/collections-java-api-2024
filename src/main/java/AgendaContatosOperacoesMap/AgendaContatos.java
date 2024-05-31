package main.java.AgendaContatosOperacoesMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Edson", 121212);
        agendaContatos.adicionarContato("Edson Vasconcelos", 225522);
        agendaContatos.adicionarContato("Edson Berg", 336633);
        agendaContatos.adicionarContato("Edson Silva", 222222);
        agendaContatos.adicionarContato("Edson Camargo", 333333);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Edson Silva");


        Integer numero = agendaContatos.pesquisarPorNome("Edson Vasco");
        if (numero != null) {
            System.out.println("O número é " + numero);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
