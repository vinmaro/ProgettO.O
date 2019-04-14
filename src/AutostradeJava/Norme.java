package AutostradeJava;

import java.util.*;

public class Norme {

    // attributi

    private static int IVA;
    private HashMap<String, Float> tariffaTipoAutostrada = new HashMap<String, Float>();
    

    // costruttore
    /**
     * 
     * @param iva
     * @param tPianura - tariffa per autostrada di tipo pianura
     * @param tMontagna - tariffa per autostrada di tipo montagna
     */
    public Norme(int iva, float tPianura, float tMontagna){
        IVA = iva;
        this.tariffaTipoAutostrada.put("pianura", (Float)tPianura);
        this.tariffaTipoAutostrada.put("montagna", (Float)tMontagna);
    }


    // metodi get e set

    public static int getIVA() { return IVA; }
    public void setIVA(int iva) { IVA = iva; }

    public HashMap<String,Float> getTariffaTipoAutostrada() { return this.tariffaTipoAutostrada; }
    public void setTariffaTipoAutostrada(HashMap<String,Float> tariffaTipoAutostrada) { this.tariffaTipoAutostrada = tariffaTipoAutostrada; }


    // altri metodi

    /**
     * 
     *      metodo per modificare una tariffa dando in input la nuova tariffa 
     *      e il tipo di autostrada a cui assegnarla .
     * 
     * @param tipo - tipo autostrada
     * @param nuovaTariffa - nuova tariffa
     * @return
     */
    public boolean modTariffaTipoAutostrada(String tipo, float nuovaTariffa){
        Float verifica = tariffaTipoAutostrada.get(tipo);
        if (verifica == null) return false;
        tariffaTipoAutostrada.put(tipo, nuovaTariffa);
        return true;
    }

    /**
     * 
     *      metodo che calcola la classe di appartenenza del veicolo passato
     * 
     * @param v - oggetto veicolo 
     * @return classe di appartenenza del veicolo sotto forma di stringa
     */
    public static String calcolaClasse(Veicolo v){
        int assi = v.getAssi();
        if (assi == 1) return "A";
        if (assi == 2 && v.getAltezza() < 1.30f ) return "A";
        if (assi == 2) return "B";
        if (assi == 3) return "3";
        if (assi == 4) return "4";
        return "5";
    }


}