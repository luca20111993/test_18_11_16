/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_18_11_16;

import javax.swing.JOptionPane;

/**
 * Programma per la conversione di una somma di denaro da euro a sterlina franco e dollaro.
 *
 * @author tss
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enuncio le mie variabili
        double cam_sterlina;
        double cam_francoS;
        double cam_dollaro;
        double importo_da_cambiare;
        String input;
        double totaleS;
        double totaleFS;
        double totaleD;
        String reportS;
        String reportFS;
        String reportD;
        String reportFinale;
        
        
        //Chiedo all'utente le mie variabili di cambio , le prendo in string e le trasformo in double.
        //Do per scontato che l'utente mi dia dei numeri.
        input = JOptionPane.showInputDialog("Inserire la valuta di cambio della sterlina rispetto all'euro : ");
        cam_sterlina = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire la valuta di cambio del franco svizzero rispetto all'euro : ");
        cam_francoS = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Inserire la valuta di cambio del dollaro rispetto all'euro : ");
        cam_dollaro = Double.parseDouble(input);
        
        //Chiedo all'utente di inserire il valore dell'importo da cambiare.
        //Come detto in precedenza do per scontato che inserisca dei numeri e che il valore di partenza sia in euro
        
        input = JOptionPane.showInputDialog("Inserire l'importo in euro da 'cambiare': ");
        importo_da_cambiare = Double.parseDouble(input);
        
        //Inizio elaborazione
        
        //Per trovare il valore nella  valuta desiderata devo fare importo inserito * la valuta della moneta.
        
        //Caso 1 : caso per sterlina
        //Metto System.out.println per un controllo intermedio per me e metto il report che invece verrà visto dall'utente
        totaleS = importo_da_cambiare * cam_sterlina;
        System.out.println(totaleS);
        reportS = "La valuta attuale della sterlina è di:  " + cam_sterlina + "  e la cifra convertita ammonta a "+ totaleS +  " sterline \n";
        
        //Caso 2 : caso per franco svizzero
        //Metto System.out.println per un controllo intermedio per me e metto il report che invece verrà visto dall'utente
        totaleFS = importo_da_cambiare * cam_francoS;
        System.out.println(totaleFS);
        reportFS = "La valuta attuale del franco svizzero è di:  " + cam_francoS + "  e la cifra convertita ammonta a "+ totaleFS + " franchi svizzeri\n";
        
        
        //Caso 3 : caso per dollaro
        //Metto System.out.println per un controllo intermedio per me e metto il report che invece verrà visto dall'utente
        totaleD = importo_da_cambiare * cam_dollaro;
        System.out.println(totaleD);
        reportD = "La valuta attuale del dollaro è di:  " + cam_dollaro + "   e la cifra  convertita ammonta a "+ totaleD +" dollari\n";
        
        //Fine elaborazione
        
        //Faccio il report finale
        reportFinale = "La cifra da lei inserita ammonta a :" + importo_da_cambiare + " euro" + "\n" + reportS + reportFS + reportD;
        JOptionPane.showMessageDialog(null, reportFinale);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
