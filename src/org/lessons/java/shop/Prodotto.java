package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
    /*
    creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
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
     */

    //attributi della classe

    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    //creo un random generator

    Random randomGenerator = new Random();

    //costruttore


    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = randomGenerator.nextInt(1,101);// digli tu cosa deve fare, in questo caso generare numero random
        this.nome = nome;
        this.descrizione = descrizione;
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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
    public double getPrezzoIva(){
        double prezzoIva = prezzo + ((prezzo * iva)/100);

    }

    //metodo per sommare intero codice e stringa nome
    public String nomeCodice(){

    }



}
