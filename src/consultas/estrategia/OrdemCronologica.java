package consultas.estrategia;

import consultas.agenda.HorarioAtendimento;
import java.util.ArrayList;
import java.util.List;

public class OrdemCronologica implements EstrategiaOrdenacao {
    @Override
    public List<HorarioAtendimento> ordenar(List<HorarioAtendimento> horarios) { return new ArrayList<>(); }

    @Override
    public String getDescricao() { return null; }
}
