package AutostradeJava;

public class Pedaggio {

    /**
     * 
     * @param p - percorso
     * @return - prezzo del pedaggio
     */
    public static float calcoloPedaggio(Percorso p){
        float distanza = calcoloDistanza(p.getCaselloIngresso(), p.getCaselloUscita());
        String classe = Norme.calcolaClasse(p.getVeicolo());
        float tariffa = p.getCaselloIngresso().getAutostrada().getTariffe().get(classe);
        float parziale = distanza * tariffa;
        return approssima( parziale + ( parziale * Norme.getIVA() / 100) );
    }
    /**
     * 
     * @param ingresso - casello di ingresso
     * @param uscita - casello di uscita
     * @return distanza tra i due caselli
     */
    public static float calcoloDistanza(Casello ingresso, Casello uscita){
        return uscita.getKm() - ingresso.getKm();
    }
    /**
     * 
     * @param costo - costo da arrotondare
     * @return costo arrotondato
     */
    public static float approssima(float costo){
        return Math.round(costo*10)/10;
    }

}