package org.lessons.java.shop;

public class Television extends Product {
        /*
    creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random - fatto
- Il codice prodotto sia accessibile solo in lettura - fatto
- Gli altri attributi siano accessibili sia in lettura che in scrittura - fatto
- Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva - fatto
- Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri
(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più prodotti e testate tutte le funzionalità della classe (cioè tutti i metodi public)

Lo shop gestisce diversi tipi di prodotto:
- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente richiamate il costruttore opportuno.
Al termine dell’inserimento stampate gli elementi del carrello (fate l’override del metodo toString nelle varie classi per restituire le informazioni da stampare)

     */

    //atttributi
    private int dimension;
    private boolean smart;

    //costruttore


    public Television(String nome, String brand, double prezzo, double iva, int dimension, boolean smart) {
        super(nome, brand, prezzo, iva);
        this.dimension = dimension;
        this.smart = smart;
    }

    //getter e setter


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
