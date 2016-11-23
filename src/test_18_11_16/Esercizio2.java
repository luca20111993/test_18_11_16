/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_18_11_16;

import javax.swing.JOptionPane;

/**
 * Creare un programma dove si ha un minimo importo da versare e , quando non si versa abbastanza ,
 * dice all'utente che la somma versata non è abbastanza e che il minimo è X (scelto da noi o dalla "banca")
 *
 * @author tss
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Enuncio le variabili
        
        String input;
        double v_min;
        double v_utente;
        String report;
        
        
        
        //Elaborazione
        
        //Questa è la parte che tecnicamente dovrebbe decidere la banca
        //VOLENDO POTEVO DECIDERE IN PARTENZA LA CIFRA MINIMA SENZA RICHIEDERLA. 
        //SPERO NON LO REPUTI SBAGLIATO.
        input = JOptionPane.showInputDialog("Digitare la somma minima affinchè il versamento vada a buon fine: ");
        v_min= Double.parseDouble(input);
        //Ricordo ulteriormente alla banca la cifra che hanno inserito così , in caso non sia la cifra desiderata , possono
        //Agire di conseguenza e modificarla.
        JOptionPane.showMessageDialog(null, "Le ricordiamo che la cifra MINIMA affinchè il versamento vada a buon fine è di: " + v_min);
        
        
        //Questa è la parte che tecnicamente dovrebbe avere l'utente. Mentre digita gli ricordo la cifra minima per il versamento.
        
        input = JOptionPane.showInputDialog("Buongiorno! Questa finestra le permette di versare sul suo conto. " + "\nLa cifra minima affinchè l'operazione vada a buon fine è di :" + v_min + "  (questo numero è compreso)" +  "\nDigiti qua sotto l'importo desiderato da versare." );
        v_utente = Double.parseDouble(input);
        
        
        //Inizio elaborazione
        
        if (v_utente  >= v_min){
            report = "Il versamento di " + v_utente + " è andato a buon fine poichè è sopra la somma minima richiesta";
           
        }else{
            report = "Il versamento di " + v_utente + " non è andato a buon fine poichè la somma minima accettabile è di: " + v_min;
        }
        
        JOptionPane.showMessageDialog(null, "versamento minimo: " + v_min + "\nCifra versata dall'utente: " + v_utente + "\n" + report);
        
        
        
        
        
    }
    
}
