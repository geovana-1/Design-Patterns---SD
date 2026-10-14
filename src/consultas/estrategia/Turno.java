package consultas.estrategia;

import java.time.LocalDateTime;

public enum Turno {

    MANHA,
    TARDE,
    NOITE;

    public static Turno de(LocalDateTime dataHora) {
        int hora = dataHora.getHour();

        if (hora < 12) {
            return MANHA;
        }

        if (hora < 18) {
            return TARDE;
        }

        return NOITE;
    }
}