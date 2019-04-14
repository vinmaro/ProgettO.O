package AutostradeJava;

import java.util.*;

public class Autostrada {

    // attributi

    private String nome;
    private String tipo;    // il tipo identifica montagna, pianura, ecc ...
    private HashMap<String, Float> tariffe = new HashMap<String, Float>();
    private HashMap<Integer, Casello> caselli = new HashMap<Integer, Casello>();

    // costruttori

    // costruttore base

    /**
     * 
     * @param nome - nome autostrade
     * @param tariffe - tariffe
     */
    public Autostrada(String nome, List<Float> tariffe) {
        this.nome = nome;
        // inserimento tariffe nell' hashmap
        this.tariffe.put("A",tariffe.get(0));
        this.tariffe.put("B",tariffe.get(1));
        this.tariffe.put("1",tariffe.get(2));
        this.tariffe.put("2",tariffe.get(3));
        this.tariffe.put("3",tariffe.get(4));
    }
    /**
     * 
     *      prendiamo una List di caselli in ingresso anzichè un 
     *      HashMap per motivi di praticità (stessa cosa per le tariffe) .
     * 
     * @param nome - nome dell' autostrada
     * @param t1 - tariffa legata alla classe veicolo A 
     * @param t2 - tariffa legata alla classe veicolo B
     * @param t3 - tariffa legata alla classe veicolo 3
     * @param t4 - tariffa legata alla classe veicolo 4
     * @param t5 - tariffa legata alla classe veicolo 5
     * @param caselli - lista di caselli
     */
    public Autostrada(String nome, List<Float> tariffe, String tipo) {
        this.nome = nome;
        // inserimento tariffe nell' hashmap
        this.tariffe.put("A",tariffe.get(0));
        this.tariffe.put("B",tariffe.get(1));
        this.tariffe.put("1",tariffe.get(2));
        this.tariffe.put("2",tariffe.get(3));
        this.tariffe.put("3",tariffe.get(4));
        this.tipo = tipo;
    }


    // metodi get e set

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public HashMap<String,Float> getTariffe() { return this.tariffe; }
    public void setTariffe(List<Float> tariffe) {
        this.tariffe.put("A",tariffe.get(0));
        this.tariffe.put("B",tariffe.get(1));
        this.tariffe.put("1",tariffe.get(2));
        this.tariffe.put("2",tariffe.get(3));
        this.tariffe.put("3",tariffe.get(4));
    }

    public HashMap<Integer,Casello> getCaselli() { return this.caselli; }
    public void setCaselli(List<Casello> caselli) { 
        for(Casello c : caselli){
            this.caselli.put(c.getId(), c);
        } 
    }

    public String getTipo() { return this.tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

}