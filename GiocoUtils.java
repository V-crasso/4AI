package gioco.utils;

import gioco.personaggi.Personaggio;

public class GiocoUtils {

    public static void stampaStatus(Personaggio p) {
        System.out.println("----- STATUS -----");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Livello: " + p.getLivello());
        System.out.println("Punti Vita: " + p.getPuntiVita());
        System.out.println("------------------");
    }
}