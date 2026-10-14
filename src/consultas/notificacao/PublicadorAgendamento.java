package consultas.notificacao;

import consultas.modelo.Consulta;
import java.util.ArrayList;
import java.util.List;

public class PublicadorAgendamento {
    private List<ObservadorAgendamento> observadores = new ArrayList<>();

    public void inscrever(ObservadorAgendamento o) { }
    public void remover(ObservadorAgendamento o) { }
    public boolean estaInscrito(ObservadorAgendamento o) { return false; }
    public void notificar(Consulta consulta) { }
}
