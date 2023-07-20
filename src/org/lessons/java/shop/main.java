package org.lessons.java.shop;

public class main {
    public static void main(String[] args) {
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


        Prodotto p = new Prodotto("samsung", "telefono sopravvalutato", 150, 10);
        System.out.println(p.getCodice());


    }
}
