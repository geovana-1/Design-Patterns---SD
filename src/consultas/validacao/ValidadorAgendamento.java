package consultas.validacao;

import consultas.agenda.HorarioAtendimento;
import consultas.modelo.Paciente;

public abstract class ValidadorAgendamento {
    private ValidadorAgendamento proximo;

    public ValidadorAgendamento setProximo(ValidadorAgendamento proximo) { return null; }

    public final void validar(Paciente paciente, HorarioAtendimento horario) { }

    protected abstract void verificar(Paciente paciente, HorarioAtendimento horario);
}
