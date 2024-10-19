/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import presentation.FrameReservation;
import javax.swing.JOptionPane;
import java.util.Locale;



public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private String frenchDate;
    private String timeSlot;
    private int nbGuest;
    private int tableNumber;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        //TODO
        if (date != null) {
            DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
            frenchDate = date.format(frenchFormatter);
            System.out.println("Selected date: " + date);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No date selected.");
        }
        
    }

    public void handleTimeSelectedEvent(String time) {
        if (time != null) {
            timeSlot = time;
            System.out.println("Selected time: " + time);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No time selected.");
        }
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        if (nbPersons > 0) {
            nbGuest = nbPersons;
            System.out.println("Selected number of guests: " + nbPersons);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No number selected.");
        }
    }

    public void handleTableSelectedEvent(int numTable) {
        if (numTable > 0 ){
            tableNumber = numTable;
            System.out.println("Selected table: Table " + numTable);
        } else {
            System.out.println("No Table selected");
        }
    }

    public void handleCancelEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        JOptionPane.showMessageDialog(null, "Réservation validée pour le " +
                            frenchDate +
                            " à " + timeSlot + " pour " + nbGuest +
                            " personnes à la Table"+ tableNumber + ".");
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
