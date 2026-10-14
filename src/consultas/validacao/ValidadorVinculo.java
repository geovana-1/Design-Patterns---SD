package consultas.validacao;

import consultas.agenda.HorarioAtendimento;
import consultas.modelo.Paciente;

public class ValidadorVinculo extends ValidadorAgendamento {
    @Override
    protected void verificar(Paciente paciente, HorarioAtendimento horario) { }
}
