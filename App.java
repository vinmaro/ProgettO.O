
/**
 * 
 * @author: Marono Vincenzo,  matricola: 254457 
 *          Gruppo studio: Alessio Farinelli, Simone Belli, Shandor Taccone. 
 */

import java.util.*;
import src.AutostradeJava.*;
import src.AutostradeJava.Testing.*;

public class App {
    public static void main(String[] args) {

        HashMap<Integer, Percorso> percorsi = new HashMap<Integer, Percorso>();

        // creazione veicolo
        BmwX1 bmw = new BmwX1();

        // lista tariffe autostrada
        LinkedList<Float> tariffe = new LinkedList<Float>();
        tariffe.add(1.2f);
        tariffe.add(1.3f);
        tariffe.add(1.4f);
        tariffe.add(1.5f);
        tariffe.add(1.6f);

        // creazione autostrada
        Autostrada A14 = new Autostrada("A14", tariffe);

        // casello di iingresso e uscita per simulazione
        Casello ingresso = new Casello(A14, 300.5f, "c1");
        Casello uscita = new Casello(A14, 325.6f, "c2");

        // lista da passare al metodo set caselli delò'autostrada
        LinkedList<Casello> caselli = new LinkedList<Casello>();
        caselli.add(ingresso);
        caselli.add(uscita);

        A14.setCaselli(caselli);

        // simuliamo l'ingresso dell'auto al casello c1 e l'uscita al casello c2
        // l'ingresso dell'auto avrà l'effetto di produrre un ogetto Percorso che
        // indicherà il percorso tramite il casello di ingresso dell'auto che lo sta
        // percorrendo. sul biglietto verrà stampato l'id di questo percorso che
        // servirà all'arrivo al casello di uscita per recuperare l'ogetto percorso
        // dell' hashmap percorsi.
        // memorizzeremo l'id ( a scopo di test ) in una variabile intera.
        // questo oggetto servirà per calcolare il pedaggio

        Percorso p = bmw.ingresso(ingresso);
        int id = p.getId();
        percorsi.put(id, p);
        float pedaggio = bmw.uscita(uscita, p);
        System.out.println(pedaggio);
    }
}