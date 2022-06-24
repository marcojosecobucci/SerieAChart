public class Main {
    public static void main(String[] args) {
        Classifica serieA = new Classifica();
        Squadra milan = new Squadra("Milan");
        Squadra inter = new Squadra("Inter");
        Squadra juventus = new Squadra("Juventus");
        Squadra napoli = new Squadra("Napoli");

        serieA.iscriviSquadra(milan);
        serieA.iscriviSquadra(inter);
        serieA.iscriviSquadra(juventus);
        serieA.iscriviSquadra(napoli);

        milan.addNewGiocatore("Mike", "Magnain");
        milan.addNewGiocatore("Fikayo", "Tomori");
        milan.addNewGiocatore("Zlatan", "Ibrahimovic");


        serieA.partita(milan, inter);
        serieA.partita(juventus, napoli);

        serieA.partita(milan, juventus);
        serieA.partita(inter, napoli);

        serieA.partita(milan, napoli);
        serieA.partita(juventus, inter);
        System.out.println();
        serieA.classifica();
        System.out.println();
        serieA.getMiglioreAttacco();
        System.out.println();
        serieA.getPeggioreDifesa();
    }
}