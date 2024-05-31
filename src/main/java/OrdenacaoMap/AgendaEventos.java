package main.java.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    // Atributos
    private Map<LocalDate, Evento> eventoMap;

    // Construtor
    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    // Método para adicionar evento
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    // Método para exibir a agenda
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            System.out.println("Data: " + entry.getKey() + " | Evento: " + entry.getValue());
        }
    }

    // Método para obter o próximo evento
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 31), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 25), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 24), "Em nome da Verdade", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }


}




