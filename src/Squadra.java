import java.util.ArrayList;
import java.util.List;

public class Squadra implements Comparable<Squadra> {
    private String ID;
    private String nome;
    private List<Giocatore> rosa;
    private int punti;
    private int goalFatti;
    private int goalSubiti;

    public Squadra(String nome) {
        ID = nome + (int) (Math.random() * 100);
        this.nome = nome;
        rosa = new ArrayList<>();
        punti = 0;
        goalFatti = 0;
        goalSubiti = 0;
    }

    public String getNome() {
        return nome;
    }

    public int punti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti += punti;
    }

    public int goalFatti() {
        return goalFatti;
    }

    public void setGoalFatti(int goalFatti) {
        this.goalFatti += goalFatti;
    }

    public int goalSubiti() {
        return goalSubiti;
    }

    public void setGoalSubiti(int goalSubiti) {
        this.goalSubiti += goalSubiti;
    }

    public void addNewGiocatore(String nome, String cognome) {
        rosa.add(new Giocatore(nome, cognome));
    }

    public void visualizzaRosa() {
        System.out.println(rosa);
    }

    @Override
    public int compareTo(Squadra o) {
        return this.punti - o.punti;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", punti=" + punti +
                ", goal fatti=" + goalFatti +
                ", goal subiti=" + goalSubiti;
    }
}
