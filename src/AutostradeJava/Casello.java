package AutostradeJava;

public class Casello {

    // attributi
    private Autostrada autostrada;      // autostrada a cui appartiene il casello
    private static int count = 1;       // variabile statica per generare id progressivi
    private int id;                     // codice univoco casello 
    private float km;                   // km a cui si trova il casello
    private String nome;

    // blocco di inizializzazione 

    {
        this.id = count;
        count++;
    }


    // costruttore
    /**
     * 
     * @param autostrada
     * @param km
     * @param nome
     */
    public Casello(Autostrada autostrada, float km, String nome) {
        this.autostrada = autostrada;
        this.km = km;
        this.nome = nome;
    }


    // metodi get e set

    public Autostrada getAutostrada() { return this.autostrada; }
    public void setAutostrada(Autostrada autostrada) {this.autostrada = autostrada;}

    public int getId() { return this.id; }

    public float getKm() { return this.km; }
    public void setKm(float km) { this.km = km; }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }


}