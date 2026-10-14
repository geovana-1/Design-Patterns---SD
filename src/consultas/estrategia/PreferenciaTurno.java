package consultas.estrategia;

import consultas.agenda.HorarioAtendimento;
import java.util.ArrayList;
import java.util.List;

public class PreferenciaTurno implements EstrategiaOrdenacao {
    private Turno turnoPreferido;

    public PreferenciaTurno(Turno turnoPreferido) { }

    @Override
    public List<HorarioAtendimento> ordenar(List<HorarioAtendimento> horarios) { return new ArrayList<>(); }

    @Override
    public String getDescricao() { return null; }
}
