import java.util.ArrayList;
import java.util.Collections;

public class Classifica  {
    private ArrayList<Squadra> squadre;

    public Classifica() {
        squadre = new ArrayList<Squadra>();
    }

    public void iscriviSquadra(Squadra s) {
        squadre.add(s);
    }

    public void partita(Squadra squadraInCasa, Squadra squadraInTrasferta) {
        int goalSquadraInCasa = generatoreDiGoalRandom();
        int goalSquadraInTrasferta = generatoreDiGoalRandom();

        squadraInCasa.setGoalFatti(goalSquadraInCasa);
        squadraInCasa.setGoalSubiti(goalSquadraInTrasferta);

        squadraInTrasferta.setGoalFatti(goalSquadraInTrasferta);
        squadraInTrasferta.setGoalSubiti(goalSquadraInCasa);

        if (goalSquadraInCasa > goalSquadraInTrasferta) {
            squadraInCasa.setPunti(3);
        } else if (goalSquadraInCasa == goalSquadraInTrasferta) {
            squadraInCasa.setPunti(1);
            squadraInTrasferta.setPunti(1);
        } else {
            squadraInTrasferta.setPunti(3);
        }

        System.out.println(squadraInCasa.getNome() + " " + goalSquadraInCasa + " : " + squadraInTrasferta.getNome() + " " + goalSquadraInTrasferta);
    }

    private int generatoreDiGoalRandom() {
        return (int) ((Math.random() * 10) / 2);
    }

    public void classifica(){
        Collections.sort(squadre, Collections.reverseOrder());
        System.out.println(squadre);
    }

    public void getMiglioreAttacco() {
        Squadra migliorAttacco = squadre.get(0);
        for (int i= 1; i < squadre.size(); i++) {
            if (migliorAttacco.goalFatti() < squadre.get(i).goalFatti()){
                migliorAttacco = squadre.get(i);
            }
        }
        System.out.println("Miglior attaco: "+ migliorAttacco);
    }

    public void getPeggioreDifesa() {
        Squadra peggiorDifesa = squadre.get(0);
        for (int i= 1; i < squadre.size(); i++) {
            if (peggiorDifesa.goalSubiti() < squadre.get(i).goalSubiti()){
                peggiorDifesa = squadre.get(i);
            }
        }
        System.out.println("Peggior difesa: "+ peggiorDifesa);
    }
}
