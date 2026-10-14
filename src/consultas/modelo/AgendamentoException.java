package consultas.modelo;

/**
 * Erro de regra de negócio do agendamento.
 * Lançada por quem encontra o problema (validadores, agenda) e
 * capturada pelo menu, que mostra a mensagem ao usuário.
 */
public class AgendamentoException extends RuntimeException {

    public AgendamentoException(String mensagem) {
        super(mensagem);
    }
}
