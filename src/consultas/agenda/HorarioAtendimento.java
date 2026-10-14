package consultas.agenda;

import consultas.modelo.Clinica;
import consultas.modelo.Psicologo;
import java.time.LocalDateTime;

public class HorarioAtendimento {
    public static final int DURACAO_MINUTOS = 50;

    private int id;
    private Clinica clinica;
    private Psicologo psicologo;
    private LocalDateTime inicio;
    private boolean reservado;

    public HorarioAtendimento(int id, Clinica clinica, Psicologo psicologo, LocalDateTime inicio) { }

    public int getId() { return 0; }
    public Clinica getClinica() { return null; }
    public Psicologo getPsicologo() { return null; }
    public LocalDateTime getInicio() { return null; }
    public boolean isReservado() { return false; }

    void marcarReservado() { }

    @Override
    public String toString() { return ""; }
}
