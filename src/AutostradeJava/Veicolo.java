package AutostradeJava;

public class Veicolo implements PercorrenzaAutostradale {

    // attributi

    private String modello;
    private String marca;
    private String targa;
    private int assi;
    private int anno;   // anno di immatricolazione del veicolo
    private float altezza;
    private float peso;
    private float emissioni;    // emissioni espresse in quantità di CO2 prodotta


    // costruttori

    /**
     * 
     *      costruttore di base ( contiene gli attributi minimi da settare per 
     *      permettere il calcolo del pedaggio ).
     * 
     * @param targa
     * @param assi
     * @param altezza
     */
    public Veicolo(String targa, int assi, float altezza) {
        this.targa = targa;
        this.assi = assi;
        this.altezza = altezza;
    }
    /**
     * 
     *      costruttore medio 
     * 
     * @param targa - targa auto
     * @param assi - numero di assi
     * @param altezza - altezza in corrispondenza del primo asse
     * @param peso - peso auto
     */
    public Veicolo(String targa, int assi, float altezza, float peso) {
        this.targa = targa;
        this.assi = assi;
        this.altezza = altezza;
        this.peso = peso;
    }
    /**
     * 
     *      costruttore medio
     * 
     * @param targa - targa auto
     * @param assi - numero di assi
     * @param anno - anno di immatricolazione
     * @param altezza - altezza in corrispondenza del primo asse
     * @param peso - peso auto
     */
    public Veicolo(String targa, int assi, int anno, float altezza, float peso) {
        this.targa = targa;
        this.assi = assi;
        this.anno = anno;
        this.altezza = altezza;
        this.peso = peso;
    }
    /**
     * 
     *      costruttre medio
     * 
     * @param targa - targa auto
     * @param assi - numero di assi
     * @param anno - anno di immatricolazione
     * @param altezza - altezza in corrispondenza del primo asse
     * @param peso - peso auto 
     * @param emissioni - emissioni in grammi
     */
    public Veicolo(String targa, int assi, int anno, float altezza, float peso, float emissioni) {
        this.targa = targa;
        this.assi = assi;
        this.anno = anno;
        this.altezza = altezza;
        this.peso = peso;
        this.emissioni = emissioni;
    }
    /**
     * 
     *      costruttore medio
     * 
     * @param marca - marca auto
     * @param targa - targa auto
     * @param assi - numero di assi
     * @param anno - anno di immatricolazione
     * @param altezza - altezza in corrispondenza del primo asse
     * @param peso - pese auto
     * @param emissioni - emissioni in grammi
     */
    public Veicolo(String marca, String targa, int assi, int anno, float altezza, float peso, float emissioni) {
        this.marca = marca;
        this.targa = targa;
        this.assi = assi;
        this.anno = anno;
        this.altezza = altezza;
        this.peso = peso;
        this.emissioni = emissioni;
    }
    /**
     * 
     *      costruttore completo
     * 
     * @param modello - modello auto
     * @param marca - marca auto
     * @param targa - targa auto
     * @param assi - numero di assi
     * @param anno - anno di imamtricolazione
     * @param altezza - altezza in corrispondenza del primo asse   
     * @param peso - peso auto
     * @param emissioni - emissioni in grammi
     */
    public Veicolo(String modello, String marca, String targa, int assi, int anno, float altezza, float peso, float emissioni) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.assi = assi;
        this.anno = anno;
        this.altezza = altezza;
        this.peso = peso;
        this.emissioni = emissioni;
    }


    // metodi get e set

    public String getModello() { return this.modello; }
    public void setModello(String modello) { this.modello = modello; }

    public String getMarca() { return this.marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTarga() { return this.targa; }
    public void setTarga(String targa) { this.targa = targa; }

    public int getAssi() { return this.assi; }
    public void setAssi(int assi) { this.assi = assi; }

    public int getAnno() { return this.anno; }
    public void setAnno(int anno) { this.anno = anno; }

    public float getAltezza() { return this.altezza; }
    public void setAltezza(float altezza) { this.altezza = altezza; }

    public float getPeso() { return this.peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public float getEmissioni() { return this.emissioni; }
    public void setEmissioni(float emissioni) { this.emissioni = emissioni; }


    // altri metodi

    /**
     * 
     *      metodo che crea il percorso con casello di ingresso e veicolo
     *      che percorre il tratto (this)
     * 
     */
    @Override
     public Percorso ingresso(Casello ingresso){
        return new Percorso(ingresso ,this);
    }

    /**
     * 
     *      metodo chiamato al casello di uscita
     * 
     */
    @Override
     public float uscita(Casello uscita, Percorso p){
        p.setCaselloUscita(uscita);
        return pagamento(p);
    }

    /**
     * 
     *      metodo che chiama il metodo che calcola il pedaggio
     * 
     */
    @Override
    public float pagamento(Percorso p){
        return Pedaggio.calcoloPedaggio(p);
    }

}