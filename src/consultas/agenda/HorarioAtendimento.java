package consultas.agenda;

import consultas.modelo.Clinica;
import consultas.modelo.Psicologo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Um horário oferecido por um psicólogo em uma clínica.
 * Só a Agenda (mesmo pacote) pode marcá-lo como reservado.
 */
public class HorarioAtendimento {

    public static final int DURACAO_MINUTOS = 50;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private final int id;
    private final Clinica clinica;
    private final Psicologo psicologo;
    private final LocalDateTime inicio;
    private boolean reservado;

    public HorarioAtendimento(int id, Clinica clinica, Psicologo psicologo, LocalDateTime inicio) {
        this.id = id;
        this.clinica = clinica;
        this.psicologo = psicologo;
        this.inicio = inicio;
        this.reservado = false;
    }

    public int getId() {
        return id;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public boolean isReservado() {
        return reservado;
    }

    // Sem "public": só classes do pacote agenda (a Agenda) conseguem reservar.
    void marcarReservado() {
        this.reservado = true;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + inicio.format(FORMATO) + " (" + DURACAO_MINUTOS + " min) - "
                + clinica.getNome() + " - " + psicologo.getNome();
    }
}
