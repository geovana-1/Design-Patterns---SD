package consultas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Psicologo {
    private final int id;
    private final String nome;
    private final String crp;
    private final List<Clinica> clinicas = new ArrayList<>();

    public Psicologo(int id, String nome, String crp) {
        this.id = id;
        this.nome = nome;
        this.crp = crp;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCrp() { return crp; }

    public void vincular(Clinica clinica) {
        if (!clinicas.contains(clinica)) {
            clinicas.add(clinica);
        }
    }

    public boolean atendeEm(Clinica clinica) {
        return clinicas.contains(clinica);
    }
}
