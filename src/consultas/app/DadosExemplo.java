package consultas.app;

import consultas.agenda.Agenda;
import consultas.agenda.HorarioAtendimento;
import consultas.modelo.Clinica;
import consultas.modelo.Paciente;
import consultas.modelo.Psicologo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Popula o sistema em memória ao iniciar. Horários sempre a partir de amanhã. */
public class DadosExemplo {
    private final List<Clinica> clinicas = new ArrayList<>();
    private final List<Psicologo> psicologos = new ArrayList<>();
    private final List<Paciente> pacientes = new ArrayList<>();

    public DadosExemplo(Agenda agenda) {
        Clinica centro = new Clinica(1, "Clínica Centro");
        Clinica batel = new Clinica(2, "Clínica Batel");
        clinicas.add(centro);
        clinicas.add(batel);

        Psicologo ana = new Psicologo(1, "Dra. Ana Souza", "08/12345");
        Psicologo bruno = new Psicologo(2, "Dr. Bruno Lima", "08/23456");
        Psicologo carla = new Psicologo(3, "Dra. Carla Mendes", "08/34567");
        ana.vincular(centro);
        ana.vincular(batel);   // atende nas duas clínicas
        bruno.vincular(centro);
        carla.vincular(batel);
        psicologos.add(ana);
        psicologos.add(bruno);
        psicologos.add(carla);

        pacientes.add(new Paciente(1, "Maria Oliveira"));
        pacientes.add(new Paciente(2, "Pedro Santos"));

        LocalDate amanha = LocalDate.now().plusDays(1);
        LocalDate depois = amanha.plusDays(1);
        // Fora de ordem de propósito, para as estratégias de ordenação mostrarem diferença.
        agenda.adicionar(new HorarioAtendimento(1, centro, ana, depois.atTime(19, 0)));
        agenda.adicionar(new HorarioAtendimento(2, centro, ana, amanha.atTime(14, 0)));
        agenda.adicionar(new HorarioAtendimento(3, centro, ana, depois.atTime(9, 0)));
        agenda.adicionar(new HorarioAtendimento(4, centro, ana, amanha.atTime(8, 0)));
        agenda.adicionar(new HorarioAtendimento(5, batel, ana, amanha.atTime(18, 30)));
        agenda.adicionar(new HorarioAtendimento(6, centro, bruno, amanha.atTime(10, 0)));
        agenda.adicionar(new HorarioAtendimento(7, centro, bruno, depois.atTime(15, 0)));
        agenda.adicionar(new HorarioAtendimento(8, batel, carla, amanha.atTime(16, 0)));
    }

    public List<Clinica> getClinicas() { return new ArrayList<>(clinicas); }
    public List<Psicologo> getPsicologos() { return new ArrayList<>(psicologos); }
    public List<Paciente> getPacientes() { return new ArrayList<>(pacientes); }
}
