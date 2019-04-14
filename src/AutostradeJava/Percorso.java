package AutostradeJava;

public class Percorso{

    // attributi
    private static int count = 1;
    private int id;
    private Casello caselloIngresso;
    private Casello caselloUscita;
    private Veicolo veicolo;


    // blocco di inizializzazione

    {
        this.id = count;
        count++;
    }

    // costruttore

    public Percorso(Casello ingresso, Veicolo v){
        this.caselloIngresso = ingresso;
        this.caselloUscita = null;
        this.veicolo = v;
    }


    // metodi set e get

    public Casello getCaselloIngresso() { return this.caselloIngresso; }
    public void setCaselloIngresso(Casello caselloIngresso) { this.caselloIngresso = caselloIngresso; }

    public Casello getCaselloUscita() { return this.caselloUscita; }
    public void setCaselloUscita(Casello caselloUscita) { this.caselloUscita = caselloUscita; }

    public Veicolo getVeicolo() { return this.veicolo; }
    public void setVeicolo(Veicolo veicolo) { this.veicolo = veicolo; }

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }


}