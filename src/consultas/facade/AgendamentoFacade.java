package consultas.facade;

import consultas.agenda.Agenda;
import consultas.agenda.HorarioAtendimento;
import consultas.app.DadosExemplo;
import consultas.estrategia.EstrategiaOrdenacao;
import consultas.modelo.Clinica;
import consultas.modelo.Consulta;
import consultas.modelo.Paciente;
import consultas.modelo.Psicologo;
import consultas.notificacao.PublicadorAgendamento;
import consultas.validacao.ValidadorAgendamento;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoFacade {
    private DadosExemplo dados;
    private Agenda agenda;
    private ValidadorAgendamento validador;
    private PublicadorAgendamento publicador;
    private List<Consulta> consultas = new ArrayList<>();
    private int proximoIdConsulta = 1;

    public AgendamentoFacade(DadosExemplo dados, Agenda agenda,
                             ValidadorAgendamento validador,
                             PublicadorAgendamento publicador) { }

    public List<Clinica> listarClinicas() { return new ArrayList<>(); }
    public List<Psicologo> listarPsicologosDaClinica(Clinica c) { return new ArrayList<>(); }
    public List<Paciente> listarPacientes() { return new ArrayList<>(); }
    public List<Consulta> listarConsultas() { return new ArrayList<>(); }

    public List<HorarioAtendimento> listarHorarios(Clinica c, Psicologo p, EstrategiaOrdenacao estrategia) {
        return new ArrayList<>();
    }

    public Consulta agendar(Paciente paciente, HorarioAtendimento horario) { return null; }
}