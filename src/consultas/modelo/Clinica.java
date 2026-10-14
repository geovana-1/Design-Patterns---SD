package consultas.modelo;

public class Clinica {
    private final int id;
    private final String nome;

    public Clinica(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
}
