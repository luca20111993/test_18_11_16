/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_18_11_16;

import javax.swing.JOptionPane;

/**
 * Chiedo quante persone lanciano il peso e li metto in un array per ogni
 * lanciatore segno il lancio effettuato stampo i vari lanci con annesso nome
 *
 * Successivamente segno il lancio più lungo e quello più corto
 *
 * @author tss
 */
public class Esercizio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enuncio le variabili
        String input;
        int n_atleti=0;
        int i;
        int conta;
        double risultato_a;
        double min = 999999999;
        double max = 0;
        String n_min="";
        String n_max="";
        String report="";
        String report2="";
        

        //Inizio elaborazione
        //Chiedo all'utente quanti sono gli atleti che partecipano alla competizione
        input = JOptionPane.showInputDialog("Quanti sono gli atleti che partecipano alla competizione? ");
        n_atleti=Integer.parseInt(input);

        //Inizializzo 2 array uno per il nome del lanciatore
        String nome_atleta[] = new String[n_atleti];
        //L'altro per il risultato conseguito
        double risultato_atleta[] = new double[n_atleti];

        //Inizio elaborazione
        //Avvio ciclo for
        for (i = 0; i < nome_atleta.length; i++) {

            //Faccio uno dei miei contatori sbagliati che so che sono sbagliati ma non so mai come non complicarmi la vita
            conta = i + 1;
            //Chiedo il nome all'atleta
            input = JOptionPane.showInputDialog("Atleta n: " + conta + "  Inserire il nome dell'atleta: ");
            //Butto il nome dell'atleta nell'array dei nomi degli atleti
            nome_atleta[i] = input;
            //Chiedere il risultato che ha ottenuto l'atleta
            input = JOptionPane.showInputDialog("Atleta n: " + conta + "  inserire il risultato dell'atleta: ");
            // trasformo in double
            risultato_a = Double.parseDouble(input);
            //butto il risultato nell'array idoneo
            risultato_atleta[i] = risultato_a;

            report += "Il nome dell'atleta n " + conta + " è " + nome_atleta[i] +" ed ha effettuato un lancio di : " + risultato_atleta[i] + "\n";
                    
                    
            //Calcolo il tipo più sola e quello migliore
            
            if (i == 0) {
                min = risultato_atleta[i];
                max = risultato_atleta[i];
            } else {
                if (risultato_atleta[i] < min) {
                    min = risultato_atleta[i];
                    n_min = nome_atleta[i];
                } else {
                    if (risultato_atleta[i] > max) {
                        max = risultato_atleta[i];
                        n_max = nome_atleta[i];

                    }
                }

            }
            report2 = "L'atleta con il tiro peggiore è stato: " + n_min + " con un tiro di: " + min + "\nL'atleta con il tiro migliore è stato: " + n_max + " con un tiro di: " + max ;
        }
         JOptionPane.showMessageDialog(null, report + "\n" + report2);
    }

}
