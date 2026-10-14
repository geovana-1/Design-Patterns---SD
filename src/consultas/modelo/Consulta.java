package consultas.modelo;

import consultas.agenda.HorarioAtendimento;

public class Consulta {
    private final int id;
    private final Paciente paciente;
    private final HorarioAtendimento horario;

    public Consulta(int id, Paciente paciente, HorarioAtendimento horario) {
        this.id = id;
        this.paciente = paciente;
        this.horario = horario;
    }

    public int getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public HorarioAtendimento getHorario() { return horario; }

    // Clínica e psicólogo vêm do horário, sem duplicar dados.
    public Clinica getClinica() { return horario.getClinica(); }
    public Psicologo getPsicologo() { return horario.getPsicologo(); }
}
