package consultas.estrategia;

import consultas.agenda.HorarioAtendimento;
import java.util.List;

public interface EstrategiaOrdenacao {
    List<HorarioAtendimento> ordenar(List<HorarioAtendimento> horarios);
    String getDescricao();
}
