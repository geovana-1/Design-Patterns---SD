package consultas.app;

import consultas.agenda.Agenda;
import consultas.modelo.Clinica;
import consultas.modelo.Paciente;
import consultas.modelo.Psicologo;
import java.util.ArrayList;
import java.util.List;

public class DadosExemplo {
    private List<Clinica> clinicas = new ArrayList<>();
    private List<Psicologo> psicologos = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public DadosExemplo(Agenda agenda) { }

    public List<Clinica> getClinicas() { return new ArrayList<>(); }
    public List<Psicologo> getPsicologos() { return new ArrayList<>(); }
    public List<Paciente> getPacientes() { return new ArrayList<>(); }
}