package Agenda_Compromissos;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.Inserir(new Compromisso("Reunião com o chefe", "Escritório", LocalDate.of(2023, 8, 2)));
        agenda.Inserir(new Compromisso("Consulta médica", "Hospital", LocalDate.of(2023, 8, 5)));
        agenda.Inserir(new Compromisso("Almoço com os amigos", "Restaurante", LocalDate.of(2023, 8, 7)));

        System.out.println("Lista de compromissos:");
        for (Compromisso compromisso : agenda.Listar()) {
            System.out.println(compromisso);
        }

        System.out.println("Pesquisa de compromissos no mês de agosto:");
        for (Compromisso compromisso : agenda.Pesquisar(8, 2023)) {
            System.out.println(compromisso);
        }
    }

}

