package gioco.personaggi;

public class Mago extends Personaggio {

    public Mago(String nome, int livello, int puntiVita) {
        super(nome, livello, puntiVita);
    }

    @Override
    public void attacca() {
        System.out.println(nome + " lancia un incantesimo!");
    }

    @Override
    public void difendi() {
        System.out.println(nome + " crea una barriera magica!");
    }
}