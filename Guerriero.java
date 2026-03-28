package gioco.personaggi;

public class Guerriero extends Personaggio {

    public Guerriero(String nome, int livello, int puntiVita) {
        super(nome, livello, puntiVita);
    }

    @Override
    public void attacca() {
        System.out.println(nome + " attacca con la spada!");
    }

    @Override
    public void difendi() {
        System.out.println(nome + " si difende con lo scudo!");
    }
}