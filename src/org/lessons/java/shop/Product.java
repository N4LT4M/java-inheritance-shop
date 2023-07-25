package org.lessons.java.shop;

import java.util.Random;

public class Product {
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

    //attributi della classe

    private int codice;
    private String nome;
    private String brand;
    private double prezzo;
    private double iva;

    //creo un random generator

    Random randomGenerator = new Random();

    //costruttore


    public Product(String nome, String brand, double prezzo, double iva) {
        this.codice = randomGenerator.nextInt(1,10000);// digli tu cosa deve fare, in questo caso generare numero random
        this.nome = nome;
        this.brand = brand;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //getter e setter


    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //metodo per ottenere prezzo + iva
    public double getPrezzoConIva(){
        return prezzo + ((prezzo * iva)/100);

    }
    //metodo che fa il codice di otto cifre
    private String getCodiceOttoCifre(){
        String codice = String.valueOf(this.codice);
        while (codice.length() < 8) {
            codice = "0" + codice;
        }
        return codice;
    }

    //metodo per sommare intero codice e stringa nome
    public String getNomeCodice(){
        return getCodiceOttoCifre() + " - " + nome;
    }




}
