package consultas.app;

import consultas.facade.AgendamentoFacade;
import consultas.notificacao.NotificadorPaciente;
import consultas.notificacao.PublicadorAgendamento;

public class MenuConsole {
    private AgendamentoFacade facade;
    private PublicadorAgendamento publicador;
    private NotificadorPaciente notificador;

    public MenuConsole(AgendamentoFacade facade, PublicadorAgendamento publicador,
                       NotificadorPaciente notificador) { }

    public void iniciar() { }
}
