package consultas.validacao;

import consultas.agenda.HorarioAtendimento;
import consultas.modelo.Paciente;

public class ValidadorDataFutura extends ValidadorAgendamento {
    @Override
    protected void verificar(Paciente paciente, HorarioAtendimento horario) { }
}
