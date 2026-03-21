public class animali {
    // ===== FILE: Animale.java =====
package zoo.animali;

public abstract class Animale {
    protected String nome;
    protected int eta;

    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public abstract void verso();
    public abstract void muovi();
}


// ===== FILE: Leone.java =====
package zoo.animali;

public class Leone extends Animale {

    public Leone(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println(nome + " ruggisce: ROAR!");
    }

    @Override
    public void muovi() {
        System.out.println(nome + " cammina maestosamente.");
    }
}


// ===== FILE: Scimmia.java =====
package zoo.animali;

public class Scimmia extends Animale {

    public Scimmia(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println(nome + " urla: UH UH AH AH!");
    }

    @Override
    public void muovi() {
        System.out.println(nome + " si arrampica sugli alberi.");
    }
}


// ===== FILE: ZooUtils.java =====
package zoo.utils;

import zoo.animali.Animale;

public class ZooUtils {

    public static void stampaInfo(Animale a) {
        System.out.println("Tipo: " + a.getClass().getSimpleName());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Età: " + a.getEta());
        System.out.println("----------------------");
    }
}


// ===== FILE: ZooMain.java =====
package zoo;

import zoo.animali.*;
import zoo.utils.ZooUtils;
import java.util.ArrayList;

public class ZooMain {

    public static void main(String[] args) {

        ArrayList<Animale> animali = new ArrayList<>();

        animali.add(new Leone("Simba", 5));
        animali.add(new Scimmia("George", 3));
        animali.add(new Leone("Mufasa", 8));
        animali.add(new Scimmia("Coco", 2));

        for (Animale a : animali) {
            ZooUtils.stampaInfo(a);
            a.verso();
            a.muovi();
            System.out.println();
        }
    }
}
}
