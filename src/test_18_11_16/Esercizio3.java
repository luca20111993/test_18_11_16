/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_18_11_16;

import javax.swing.JOptionPane;

/**
 * chiedere 5 nomi di auto (o usare frase exit per terminare prima)
 * preparando un report e poi stamparlo
 * @author tss
 */
public class Esercizio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Enuncio le variabili
        String input;
        int n_auto;
        boolean ancora = true;
        int i = 0;
        String report = "";
        
        //Inizio elaborazione
        
        //Chiedo all'utente quante auto vuole inserire
        input = JOptionPane.showInputDialog("Quante auto devi inserire oggi? ");
        n_auto = Integer.parseInt(input);
        
        //Avvio un ciclo while
        while (ancora == true){
            //Faccio un contatore in modo da sapere quante auto sto inserendo
            i = i+1;
            //Chiedo all'utente il nome della macchina da inserire 
            input = JOptionPane.showInputDialog( i + "#" + "Inserire nome della macchina: ");
            
            
            //caso "exit" se l'utente scrive exit il programma si interrompe e mi da il report fino a quel momento
            if (input.equalsIgnoreCase("exit")) {
                            break;
            }
            //Report delle auto (Continua ad aggiornarsi dopo ogni ciclo)
            report += i + " # " + input + "\n";
            
            //Condizione d'uscita
            if (i == n_auto){
                ancora =false;
            }
        }//Fine ciclo while
        
        //Report d'uscita per l'utente
        JOptionPane.showMessageDialog(null, "le auto inserite sono: " + "\n" + report);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
