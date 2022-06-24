public class Giocatore {

    private String ID;
    private String nome;
    private String cognome;

    public Giocatore(String nome, String cognome) {
        ID = nome + cognome + (int) (Math.random() * 100);
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", nome=" + nome +
                ", cognome= " + cognome + "\n";
    }
}
