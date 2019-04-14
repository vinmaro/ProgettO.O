package AutostradeJava;

public interface PercorrenzaAutostradale {

    // metodi

    public Percorso ingresso(Casello ingresso);
    public float uscita(Casello uscita, Percorso p);
    public float pagamento(Percorso p);

}