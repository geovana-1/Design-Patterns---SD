package consultas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Psicologo {
    private int id;
    private String nome;
    private String crp;
    private List<Clinica> clinicas = new ArrayList<>();

    public Psicologo(int id, String nome, String crp) { }

    public int getId() { return 0; }
    public String getNome() { return null; }
    public String getCrp() { return null; }

    public void vincular(Clinica clinica) { }
    public boolean atendeEm(Clinica clinica) { return false; }
}