package gioco;

import java.util.ArrayList;
import gioco.personaggi.*;
import gioco.utils.GiocoUtils;

public class GiocoMain {

    public static void main(String[] args) {

        ArrayList<Personaggio> personaggi = new ArrayList<>();

        personaggi.add(new Guerriero("Arthas", 5, 100));
        personaggi.add(new Mago("Merlino", 7, 80));

        for (Personaggio p : personaggi) {
            GiocoUtils.stampaStatus(p);
            p.attacca();
            p.difendi();
            System.out.println();
        }
    }
}