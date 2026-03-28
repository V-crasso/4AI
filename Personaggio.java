package gioco.personaggi;

public abstract class Personaggio {
    protected String nome;
    protected int livello;
    protected int puntiVita;

    public Personaggio(String nome, int livello, int puntiVita) {
        this.nome = nome;
        this.livello = livello;
        this.puntiVita = puntiVita;
    }

    public String getNome() {
        return nome;
    }

    public int getLivello() {
        return livello;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public abstract void attacca();

    public abstract void difendi();
}
