package org.lessons.java.shop;

import java.util.ArrayList;

public class Carrello {
    public static void main(String[] args) {
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

    ArrayList <Product> products = new ArrayList<>();

    //creare inserimento di un prodotto

        /*
        1. fare scegliere all'utente che tipo di prodotto
        2. inserire tutti i dati di base
        3. in base al prodotto scelto al punto 1 fare inserire i dati specifici
        4. istanziare il prodotto scelto (new Smartphone, new Television, etc...)
        5. stampare il prodotto
        (6. inserire il prodotto nella lista
         7. chiedere all'utente se vuole inserire ulteriori prodotti: se sì torno al 1. se no vado al 8
         8. stampare i prodotti contenuti nella lista)
        */













        /*Scanner scan = new Scanner(System.in);

        System.out.print("che prodotto stai cercando ?");
        String prodottoUtente = scan.nextLine();

        if (prodottoUtente == Prodotto.nome) {

        }


        Prodotto samsung = new Prodotto("samsung", "telefono sopravvalutato", 150, 10);

        String nomeCodice = samsung.getNomeCodice();
        double prezzoBase = samsung.getPrezzo();
        double prezzoConIva = samsung.getPrezzoConIva();
        System.out.println("il prodotto è: " + nomeCodice);
        System.out.println("il suo prezzo con iva esclusa è: " + prezzoBase);
        System.out.println("il suo prezzo con iva inclusa è: " + prezzoConIva);
        */



    }
}
