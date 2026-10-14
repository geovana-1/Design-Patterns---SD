package consultas.agenda;

import consultas.modelo.Clinica;
import consultas.modelo.Psicologo;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<HorarioAtendimento> horarios = new ArrayList<>();

    public void adicionar(HorarioAtendimento horario) { }

    public List<HorarioAtendimento> listarDisponiveis(Clinica clinica, Psicologo psicologo) {
        return new ArrayList<>();
    }

    public void reservar(HorarioAtendimento horario) { }
}
