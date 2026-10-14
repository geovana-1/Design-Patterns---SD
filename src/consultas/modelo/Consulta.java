package consultas.modelo;

import consultas.agenda.HorarioAtendimento;

public class Consulta {
    private int id;
    private Paciente paciente;
    private HorarioAtendimento horario;

    public Consulta(int id, Paciente paciente, HorarioAtendimento horario) { }

    public int getId() { return 0; }
    public Paciente getPaciente() { return null; }
    public HorarioAtendimento getHorario() { return null; }
    public Clinica getClinica() { return null; }
    public Psicologo getPsicologo() { return null; }
}